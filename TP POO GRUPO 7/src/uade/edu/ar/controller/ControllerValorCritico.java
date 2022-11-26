package uade.edu.ar.controller;

import uade.edu.ar.dao.ValorCriticoDAO;
import uade.edu.ar.dto.SucursalDTO;
import uade.edu.ar.dto.ValorCriticoDTO;
import uade.edu.ar.model.TipoResultado;
import uade.edu.ar.model.clases.Sucursal;
import uade.edu.ar.model.clases.ValorCritico;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ControllerValorCritico {
    private ControllerValorCritico(){}
    private ArrayList<ValorCriticoDTO> ValorCriticoDTO = new ArrayList<ValorCriticoDTO>();
    private static ArrayList<ValorCritico> ListaValoresCriticos;

    private ArrayList<ValorCriticoDTO> getValoresCriticos() {
        return ValorCriticoDTO;
    }
    private static ControllerValorCritico CONTROLLERVALORC = null;

    private static ValorCriticoDAO ValorCriticoDAO;

   public void ModificarValorCritico(int ID, ValorCriticoDTO VCDTO, TipoResultado TipoComparacion,String Valor){
        int i=0;
        while (getValoresCriticos().get(i).getIDValorC() == ID) {
            i++;}
       getValoresCriticos().get(i).setValor(VCDTO.getValor());
       getValoresCriticos().get(i).setTipoComparacion(VCDTO.getTipoComparacion());
    }


    public static synchronized ControllerValorCritico getInstances() throws Exception {
        if(CONTROLLERVALORC == null) {
            CONTROLLERVALORC = new ControllerValorCritico();
            ValorCriticoDAO = new ValorCriticoDAO(ValorCritico.class,getPathOutModel(ValorCritico.class.getSimpleName()));//se crea el dao para que ya este en memoria fisica y no crearlo todo el tiempo
            ListaValoresCriticos = ValorCriticoDAO.getAll(ValorCritico.class);//recupero la info de ese archivo creado.
        }
        return CONTROLLERVALORC;
    }

    public void addValorC(ValorCriticoDTO dto) throws Exception {
        if(getByIdModel(dto.getIDValorC()) == null){
            ValorCriticoDAO.save(toModel(dto));
        }
    }

    public ValorCriticoDTO getByIdModel(int id) throws Exception {
        for (ValorCritico model: ListaValoresCriticos) {
            if (model.getIDValorC() == id){
                return toDto(model);
            }
        }
        return  null;
    }


    public void deleteByIdModel(int id){
        int index = getIndex(id);
        if(index != -1){
            ListaValoresCriticos.remove(index);
        }
    }

    private int getIndex(int id){
        for (int i=0;i<ListaValoresCriticos.size();i++){
            if(ListaValoresCriticos.get(i).getIDValorC() == id){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<ValorCriticoDTO> getAll() throws Exception {
        ArrayList<ValorCriticoDTO> dtoList = new ArrayList<ValorCriticoDTO>();
        for (ValorCritico model : ListaValoresCriticos) {
            dtoList.add(toDto(model));
        }
        return dtoList;
    }


    private static String getPathOutModel(String name){
        String dir = "C:/IOO/";
        return  new File(dir+name+".json").getPath();
    }


    public static ValorCritico toModel(ValorCriticoDTO dto) {
        return new ValorCritico(dto.getValor(), dto.getTipoComparacion(), dto.getIDValorC());
    }
    public static ValorCriticoDTO toDto(ValorCritico model){
        return new ValorCriticoDTO(model.getIDValorC(),model.getValor(),model.getTipoComparacion());
    }

    public void GuardarValorCritico(ValorCriticoDTO dto) throws Exception {
        int pos = getIndex(dto.getIDValorC());
        if (pos != -1){
            return;
        }
        ValorCritico VC = toModel(dto);
        this.ValorCriticoDAO.save(VC);
    }

    public void EliminarVC(int id){
        try {
            ListaValoresCriticos = ValorCriticoDAO.getAll(ValorCritico.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        int posicion = getIndex(id);

        if(posicion != -1){
                ListaValoresCriticos.remove(posicion);
            try {
                ValorCriticoDAO.delete(id, "IDValorC");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            System.out.println("Valor Critico eliminado exitosamente");
            }
        else System.out.println("El Valor Critico no puede ser eliminado ya que no esta registrado en la base de datos.");
        }

    }
