package uade.edu.ar.model.clases;

import uade.edu.ar.dto.PacienteDTO;
import uade.edu.ar.model.SexoPaciente;
import uade.edu.ar.controller.ControllerPaciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Paciente {

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

    // DEFINICION DE RELACIONES

    private Usuario UsuarioAsociado;

    private ArrayList<Peticion> PeticionAsociada;

    private Sucursal SucursalAsociada;

    private ControllerPaciente ControllerPaciente;

     public Paciente(int DNI,String NombreUsuario,String Email,String Password,String Nombre,String Domicilio, String FechaNacimiento,int Edad, boolean PeticonesCompletas,SexoPaciente Sexo){
                this.DNI = DNI;
                this.NombreUsuario= NombreUsuario;
                this.Email=Email;
                this.Password=Password;
                this.Nombre=Nombre;
                this.Domicilio=Domicilio;
                this.FechaNacimiento=FechaNacimiento;
                this.Edad=Edad;
                this.PeticonesCompletas=PeticonesCompletas;
                this.Sexo=Sexo;
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

    public Usuario getUsuarioAsociado() {
        return UsuarioAsociado;
    }

    public void setUsuarioAsociado(Usuario usuarioAsociado) {
        UsuarioAsociado = usuarioAsociado;
    }

    public ArrayList<Peticion> getPeticionAsociada() {
        return PeticionAsociada;
    }

    public void setPeticionAsociada(ArrayList<Peticion> peticionAsociada) {
        PeticionAsociada = peticionAsociada;
    }

    public Sucursal getSucursalAsociada() {
        return SucursalAsociada;
    }

    public void setSucursalAsociada(Sucursal sucursalAsociada) {
        SucursalAsociada = sucursalAsociada;
    }

    public uade.edu.ar.controller.ControllerPaciente getControllerPaciente() {
        return ControllerPaciente;
    }

    public void setControllerPaciente(uade.edu.ar.controller.ControllerPaciente controllerPaciente) {
        ControllerPaciente = controllerPaciente;

      /*  public static PacienteDTO toDto(Paciente paciente){
            PacienteDTO pDTO = new Paciente(p.getDNI(), p.getNombreUsuario(), p.getEmail(), p.getPassword(), p.getNombre(), p.getDomicilio(), p.getFechaNacimiento(),p.getEdad(), p.isPeticonesCompletas(), p.getSexo());
            return pDTO;
        }
     }*/
}}
