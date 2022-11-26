package uade.edu.ar.dto;

import uade.edu.ar.model.TipoResultado;
import uade.edu.ar.model.clases.Practica;

public class ValorCriticoDTO {
    //DEFINIR ATRIBUTOS

    private String Valor;
    private int IDValorC;

    private TipoResultado TipoComparacion;

    private Practica PracticaAsociada;

    public ValorCriticoDTO(int idValorC, String valor, TipoResultado tipoComparacion) {
        this.IDValorC=idValorC;
        this.Valor=valor;
        this.TipoComparacion=tipoComparacion;
    }

    //DEFINIR METODOS
    //CONSTRUCTOR

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public TipoResultado getTipoComparacion() {
        return TipoComparacion;
    }

    public void setTipoComparacion(TipoResultado tipoComparacion) {
        TipoComparacion = tipoComparacion;
    }
    public int getIDValorC() {
        return IDValorC;
    }

    public void setIDValorC(int IDValorC) {
        this.IDValorC = IDValorC;
    }

    public Practica getPracticaAsociada() {
        return PracticaAsociada;
    }

    public void setPracticaAsociada(Practica practicaAsociada) {
        PracticaAsociada = practicaAsociada;
    }
}
