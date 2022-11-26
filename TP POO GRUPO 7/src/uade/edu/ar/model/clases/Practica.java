package uade.edu.ar.model.clases;

import java.util.ArrayList;

public class Practica {

    //DEFINIR ATRIBUTOS

    private String IDPractica;

    private String Nombre;

    private String Grupo;

    private String CantHorasResultado;

    private boolean Habilitado;


    //DEFINIR RELACIONES

    private ArrayList<ValorCritico> VCriticoAsociado;

    private ArrayList<ValorReservado> VReservadoAsociado;

    private Peticion PeticionAsociada;

    private ArrayList<Resultado> ResultadoAsociado;

    //REFLEXIVA

    //DEFINIR METODOS

    //CONSTRUCTOR RESULTADOS

    public Practica(String IDPractica,String Nombre,String Grupo,String CantHorasResultado,boolean Habilitado, ArrayList VCritico, ArrayList VReservado, Peticion PetAsociada, ArrayList ResultadoAsociado){
        this.IDPractica = IDPractica;
        this.Nombre = Nombre;
        this.Grupo = Grupo;
        this.CantHorasResultado = CantHorasResultado;
        this.Habilitado = Habilitado;
        this.VCriticoAsociado = VCritico;
        this.VReservadoAsociado = VReservado;
        this.PeticionAsociada = PetAsociada;
        this.ResultadoAsociado = ResultadoAsociado;
    }





    //GETTERS/SETTERS


    public String getIDPractica() {
        return IDPractica;
    }

    public void setIDPractica(String IDPractica) {
        this.IDPractica = IDPractica;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public String getCantHorasResultado() {
        return CantHorasResultado;
    }

    public void setCantHorasResultado(String cantHorasResultado) {
        CantHorasResultado = cantHorasResultado;
    }

    public boolean isHabilitado() {
        return Habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        Habilitado = habilitado;
    }


    public ArrayList<ValorCritico> getVCriticoAsociado() {
        return VCriticoAsociado;
    }

    public void setVCriticoAsociado(ArrayList<ValorCritico> VCriticoAsociado) {
        this.VCriticoAsociado = VCriticoAsociado;
    }

    public ArrayList<ValorReservado> getVReservadoAsociado() {
        return VReservadoAsociado;
    }

    public void setVReservadoAsociado(ArrayList<ValorReservado> VReservadoAsociado) {
        this.VReservadoAsociado = VReservadoAsociado;
    }

    public Peticion getPeticionAsociada() {
        return PeticionAsociada;
    }

    public void setPeticionAsociada(Peticion peticionAsociada) {
        PeticionAsociada = peticionAsociada;
    }

    public ArrayList<Resultado> getResultadoAsociado() {
        return ResultadoAsociado;
    }

    public void setResultadoAsociado(ArrayList<Resultado> resultadoAsociado) {
        ResultadoAsociado = resultadoAsociado;
    }



}

