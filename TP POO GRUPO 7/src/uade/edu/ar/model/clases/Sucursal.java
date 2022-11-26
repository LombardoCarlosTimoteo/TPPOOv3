package uade.edu.ar.model.clases;

import java.util.ArrayList;

public class Sucursal {

    // DEFINICION DE ATRIBUTOS

    private int Numero;

    private String Direccion;

    private String ResponsableTecnico;

    private boolean PeticonesCompletas;

    //DEFINICION DE RELACIONES

    private ArrayList<Paciente> PacienteAsociado;

    private ArrayList<Peticion> PeticionAsociada;

    public Sucursal( int Numero,String Direccion,String ResponsableTecnico,boolean PeticonesCompletas,ArrayList PacienteAsociado,ArrayList PeticionAsociada) {
        this.Numero = Numero;
        this.Direccion=Direccion;
        this.ResponsableTecnico=ResponsableTecnico;
        this.PeticonesCompletas=PeticonesCompletas;
        this.PacienteAsociado=PacienteAsociado;
        this.PeticionAsociada=PeticionAsociada;
    }
    //DEFINICION DE METODOS
        //GETTERS/SETTERS

    public ArrayList<Paciente> getPacienteAsociado() {
        return PacienteAsociado;
    }

    public void setPacienteAsociado(ArrayList<Paciente> pacienteAsociado) {
        PacienteAsociado = pacienteAsociado;
    }

    public ArrayList<Peticion> getPeticionAsociada() {
        return PeticionAsociada;
    }

    public void setPeticionAsociada(ArrayList<Peticion> peticionAsociada) {
        PeticionAsociada = peticionAsociada;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getResponsableTecnico() {
        return ResponsableTecnico;
    }

    public void setResponsableTecnico(String responsableTecnico) {
        ResponsableTecnico = responsableTecnico;
    }

    public boolean isPeticonesCompletas() {
        return PeticonesCompletas;
    }

    public void setPeticonesCompletas(boolean peticonesCompletas) {
        PeticonesCompletas = peticonesCompletas;
    }

    public boolean getPeticonesCompletas() {return PeticonesCompletas;}

}
