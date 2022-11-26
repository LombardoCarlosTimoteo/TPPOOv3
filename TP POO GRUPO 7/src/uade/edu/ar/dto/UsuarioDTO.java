package uade.edu.ar.dto;

import uade.edu.ar.controller.ControllerUsuario;
import uade.edu.ar.model.RolUsuario;
import uade.edu.ar.model.clases.Paciente;
import uade.edu.ar.model.clases.Peticion;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioDTO {

    //DEFINIR ATRIBUTOS

    private int DNI;

    private String NombreUsuario;

    private String Email;

    private String Password;

    private String Nombre;

    private String Domicilio;

    private String FechaNacimiento;

    private RolUsuario Rol;


    //DEFINIR RELACIONES

    private ArrayList<Paciente> PacienteAsociado;

    private ArrayList<Peticion> PeticionAsociada;


    public UsuarioDTO(int DNI, String NombreUsuario, String Email, String Password, String Nombre, String Domicilio, String FechaNacimiento, RolUsuario Rol) {
        this.DNI = DNI;
        this.NombreUsuario = NombreUsuario;
        this.Email = Email;
        this.Password = Password;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.FechaNacimiento = FechaNacimiento;
        this.Rol = Rol;
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

    public RolUsuario getRol() {
        return Rol;
    }

    public void setRol(RolUsuario rol) {
        Rol = rol;
    }

}
