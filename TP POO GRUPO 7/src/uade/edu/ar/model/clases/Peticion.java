package uade.edu.ar.model.clases;

import uade.edu.ar.model.clases.Paciente;

import java.util.ArrayList;
import java.util.Date;

public class Peticion {

    //DEFINIR ATRIBUTOS

    private Date FechaCarga;

    private Date FechaEntrega;

    private int IDPeticion;

    private String ObraSocial;

    private boolean Completado;



    //DEFINIR RELACIONES

    private Paciente PacienteAsociada;

    private Sucursal SucursalAsociada;

    private Usuario UsuarioAsociado;

    private ArrayList<Practica> PracticaAsociada;

    private ArrayList<Resultado> ResultadoAsociado;


    //DEFINIR METODOS

    //GETTERS/SETTERS
    public Date getFechaCarga() {
        return FechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        FechaCarga = fechaCarga;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

    public int getIDPeticion() {
        return IDPeticion;
    }

    public void setIDPeticion(int IDPeticion) {
        this.IDPeticion = IDPeticion;
    }

    public String getObraSocial() {
        return ObraSocial;
    }

    public void setObraSocial(String obraSocial) {
        ObraSocial = obraSocial;
    }

    public boolean isCompletado() {
        return Completado;
    }

    public void setCompletado(boolean completado) {
        Completado = completado;
    }

    public Paciente getPacienteAsociada() {
        return PacienteAsociada;
    }

    public void setPacienteAsociada(Paciente pacienteAsociada) {
        PacienteAsociada = pacienteAsociada;
    }

    public Sucursal getSucursalAsociada() {
        return SucursalAsociada;
    }

    public void setSucursalAsociada(Sucursal sucursalAsociada) {
        SucursalAsociada = sucursalAsociada;
    }

    public Usuario getUsuarioAsociado() {
        return UsuarioAsociado;
    }

    public void setUsuarioAsociado(Usuario usuarioAsociado) {
        UsuarioAsociado = usuarioAsociado;
    }

    public ArrayList<Practica> getPracticaAsociada() {
        return PracticaAsociada;
    }

    public void setPracticaAsociada(ArrayList<Practica> practicaAsociada) {
        PracticaAsociada = practicaAsociada;
    }

    public ArrayList<Resultado> getResultadoAsociado() {
        return ResultadoAsociado;
    }

    public void setResultadoAsociado(ArrayList<Resultado> resultadoAsociado) {
        ResultadoAsociado = resultadoAsociado;
    }

    public Peticion(Date FechaCarg, Date FechaEntrega, int IDPeticion,String ObraSocial,boolean Completado, Paciente PacAsociado, Sucursal SAsociada, Usuario UAsociado, ArrayList PracAsociada, ArrayList RAsociado){
        this.FechaCarga=FechaCarg;
        this.FechaEntrega=FechaEntrega;
        this.IDPeticion=IDPeticion;
        this.ObraSocial=ObraSocial;
        this.Completado=Completado;
        this.PacienteAsociada=PacAsociado;
        this.SucursalAsociada=SAsociada;
        this.UsuarioAsociado=UAsociado;
        this.PracticaAsociada=PracAsociada;
        this.ResultadoAsociado=RAsociado;
    }

}
