package uade.edu.ar.controller;
import uade.edu.ar.dao.PacienteDAO;
import uade.edu.ar.dto.ModelDto;
import uade.edu.ar.dto.PacienteDTO;
import uade.edu.ar.model.clases.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ControllerPaciente {
    private ControllerPaciente(){}
    private ArrayList<PacienteDTO> PacientesDTO = new ArrayList<PacienteDTO>();

    private ArrayList<PacienteDTO> getPacientes() {
        return PacientesDTO;
    }
    private static ControllerPaciente CONTROLLERPACIENTE = null;
    private static PacienteDAO PacienteDAO;
    public static ArrayList<Paciente> ListaPacientes;


    public void AgregarPaciente(PacienteDTO P){
        getPacientes().add(P);
    }

    public void ModificarPaciente (int DNI, PacienteDTO PDTO) throws Exception {

        ListaPacientes = PacienteDAO.getAll(Paciente.class);

        int pos = getIndex(PDTO.getDNI());

        if (pos == -1) {
            System.out.println("El usuario no existe en la base de datos.");
            return;
        }
        ListaPacientes.remove(pos);
        this.PacienteDAO.delete(DNI, "DNI");
        this.PacienteDAO.save(toModel(PDTO));
        System.out.println("El paciente se actualizo correctamente");
    }



    public static synchronized ControllerPaciente getInstances() throws Exception {
        if(CONTROLLERPACIENTE == null) {
            CONTROLLERPACIENTE = new ControllerPaciente();
            PacienteDAO = new PacienteDAO(Paciente.class,getPathOutModel(Paciente.class.getSimpleName()));//se crea el dao para que ya este en memoria fisica y no crearlo todo el tiempo
            ListaPacientes = PacienteDAO.getAll(Paciente.class);//recupero la info de ese archivo creado.
        }
        return CONTROLLERPACIENTE;
    }

    public void addPaciente(PacienteDTO dto) throws Exception {
        ListaPacientes = PacienteDAO.getAll(Paciente.class);
        if(getByIdModel(dto.getDNI()) == null){

            if (getIndex(dto.getDNI()) == -1){
                PacienteDAO.save(toModel(dto));
                System.out.println("El paciente se registro correctamente");
            }
            else System.out.println("El Paciente ya esta registrado");
        }
        else System.out.println("El Paciente ya esta registrado");
    }


    public PacienteDTO getByIdModel(int id) throws Exception {
        for (Paciente model: ListaPacientes) {
            if (model.getDNI() == id){
                return toDto(model);
            }
        }
        return  null;
    }

    public void deleteByIdModel(int id){
        int index = getIndex(id);
        if(index != -1){
            ListaPacientes.remove(index);
        }
    }

    private static int getIndex(int id){
        for (int i=0;i<ListaPacientes.size();i++){
            if(ListaPacientes.get(i).getDNI() == id){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<PacienteDTO> getAll() throws Exception {
        ArrayList<PacienteDTO> dtoList = new ArrayList<PacienteDTO>();
        for (Paciente model : ListaPacientes) {
            dtoList.add(toDto(model));
        }
        return dtoList;
    }

    private static String getPathOutModel(String name){
        String dir = "C:/IOO/";
        return  new File(dir+name+".json").getPath();
    }

    public static Paciente toModel(PacienteDTO dto){
        return new Paciente(dto.getDNI(),dto.getNombreUsuario(),dto.getEmail(),dto.getPassword(),dto.getNombre(),dto.getDomicilio(),dto.getFechaNacimiento(),dto.getEdad(),dto.isPeticonesCompletas(),dto.getSexo());
    }

    public static PacienteDTO toDto(Paciente model){
        return new PacienteDTO(model.getDNI(),model.getNombreUsuario(),model.getEmail(),model.getPassword(),model.getNombre(),model.getDomicilio(),model.getFechaNacimiento(),model.getEdad(),model.isPeticonesCompletas(),model.getSexo());
    }

    public static void EliminarPaciente(int id) throws Exception {
        int posicion = getIndex(id);

        if(posicion != -1){
            boolean peticion = ListaPacientes.get(posicion).isPeticonesCompletas();
            if (!peticion) {
                ListaPacientes.remove(posicion);
                PacienteDAO.delete(id, "DNI");
                System.out.println("Paciente eliminado exitosamente");
            }
            else System.out.println("El paciente no puede ser eliminado debido a que tiene al menos una peticion completa.");
        }
        else System.out.println("El paciente no puede ser eliminado ya que no esta registrado en la base de datos.");
     }



    public void mostrarResultadoPractica (String IDPractica, int DNI){

        ArrayList<Resultado> ResultadosAMostrar = new ArrayList<Resultado>();

        int posicion = getIndex(DNI);

        boolean reservado = false;

        for (Peticion P : ListaPacientes.get(posicion).getPeticionAsociada()){
            for (int i = 0; i < ListaPacientes.get(posicion).getPeticionAsociada().size(); i++){
                ArrayList<Practica> Listapractica = ListaPacientes.get(posicion).getPeticionAsociada().get(i).getPracticaAsociada();
                for (Practica PR : Listapractica){
                    if (PR.getIDPractica() == IDPractica){

                        ArrayList<Resultado> ListaResultados =  PR.getResultadoAsociado();
                        ArrayList<ValorReservado> ListaValoresReservados = PR.getVReservadoAsociado();


                        for (Resultado R : ListaResultados) {
                            String valor = R.getValor();


                            for (ValorReservado VR : ListaValoresReservados) {
                                reservado = false;
                                String comparacion = String.valueOf(VR.getTipoComparacion());
                                String valorComparacion = VR.getValor();
                                reservado = R.EsReservado(comparacion, valorComparacion, valor, reservado);
                                if(reservado) System.out.println(R.getIDResultado() + " El resultado debe ser retirado por sucursal");
                                //Almacenar resultados
                                else {
                                    ResultadosAMostrar.add(R);
                                }
                            }

                        }
                    }
                }
            }
        }
        for (Resultado R : ResultadosAMostrar){
            System.out.println(R.getIDResultado() + R.getValor());
        }
    }

 public void GuardarPaciente(PacienteDTO dto) throws Exception {
        int pos = getIndex(dto.getDNI());
        if (pos != -1){
            return;
        }

     ListaPacientes = PacienteDAO.getAll(Paciente.class);
     if(getByIdModel(dto.getDNI()) == null){

         if (getIndex(dto.getDNI()) == -1){
             this.PacienteDAO.save(toModel(dto));
             System.out.println("El paciente se registro correctamente");
         }
         else System.out.println("El Paciente ya esta registrado");
     }
     else System.out.println("El Paciente ya esta registrado");
 }

}

