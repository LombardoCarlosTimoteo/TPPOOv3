package uade.edu.ar.model.clases;

import uade.edu.ar.model.TipoResultado;

public class ValorReservado {

    //DEFINIR ATRIBUTOS

    private int IDValorR;
    private String Valor;

    private TipoResultado TipoComparacion;

    //DEFINIR RELACIONES

    private Practica PracticaAsociada;


    //DEFINIR METODOS
    //CONSTRUCTOR
    public ValorReservado() {}

    public ValorReservado(String valor, TipoResultado tipoComparacion, Practica practicaAsociada, int idValorR){}

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

    public Practica getPracticaAsociada() {
        return PracticaAsociada;
    }

    public void setPracticaAsociada(Practica practicaAsociada) {
        PracticaAsociada = practicaAsociada;
    }
    public int getIDValorR() {
        return IDValorR;
    }

    public void setIDValorR(int IDValorR) {
        this.IDValorR = IDValorR;
    }

    public ValorReservado(String Valor,TipoResultado TipoComparacion, int IDValorR){
        this.Valor=Valor;
        this.TipoComparacion=TipoComparacion;
        this.IDValorR = IDValorR;
    }


}
