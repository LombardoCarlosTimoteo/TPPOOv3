package uade.edu.ar.dto;

import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.model.SexoPaciente;
import uade.edu.ar.model.clases.Paciente;

import java.time.LocalDate;
import java.util.Date;

public class PacienteDTO {

    // DEFINICION DE ATRIBUTOS

    private int DNI;

    private String NombreUsuario;

    private String Email;

    private String Password;

    private String Nombre;

    private String Domicilio;

    private String FechaNacimiento;

    private int Edad;

    private boolean PeticonesCompletas;

    private SexoPaciente Sexo;


    //METODOS

    public PacienteDTO(int DNI, String NombreUsuario, String Email, String Password, String Nombre, String Domicilio, String FechaNacimiento, int Edad, boolean PeticonesCompletas, SexoPaciente Sexo) {
        this.DNI = DNI;
        this.NombreUsuario = NombreUsuario;
        this.Email = Email;
        this.Password = Password;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.FechaNacimiento = FechaNacimiento;
        this.Edad = Edad;
        this.PeticonesCompletas = PeticonesCompletas;
        this.Sexo = Sexo;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public boolean isPeticonesCompletas() {
        return PeticonesCompletas;
    }

    public void setPeticonesCompletas(boolean peticonesCompletas) {
        PeticonesCompletas = peticonesCompletas;
    }

    public SexoPaciente getSexo() {
        return Sexo;
    }

    public void setSexo(SexoPaciente sexo) {
        Sexo = sexo;
    }

public Paciente dtoToModel(PacienteDTO dto){
        Paciente p = new Paciente(dto.getDNI(), dto.getNombreUsuario(), dto.getEmail(), dto.getPassword(), dto.getNombre(), dto.getDomicilio(), dto.getFechaNacimiento(),dto.getEdad(), dto.isPeticonesCompletas(), dto.getSexo());
    return p;
}
//TUVE QUE AGREGAR ESTO PARA QUE EN CUSTOMTABLEMODEL NO TIRE ERROR LA FUNCION getValueAt
    public PacienteDTO getByIdModel(int id) throws Exception {
        for (Paciente model: ControllerPaciente.ListaPacientes) {//tuve que hacer que listapacientes sea publica
            if (model.getDNI() == id){
                return toDto(model);
            }
        }
        return  null;
    }

    public static PacienteDTO toDto(Paciente model){
        return new PacienteDTO(model.getDNI(),model.getNombreUsuario(),model.getEmail(),model.getPassword(),model.getNombre(),model.getDomicilio(),model.getFechaNacimiento(),model.getEdad(),model.isPeticonesCompletas(),model.getSexo());
    }
}
