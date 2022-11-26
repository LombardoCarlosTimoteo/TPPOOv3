package uade.edu.ar.model.clases;

import uade.edu.ar.model.TipoResultado;

public class ValorCritico {

    //DEFINIR ATRIBUTOS

    private String Valor;

    private TipoResultado TipoComparacion;
    private int IDValorC;



    //DEFINIR RELACIONES

    private Practica PracticaAsociada;

    //DEFINIR METODOS
        //CONSTRUCTOR
            public ValorCritico(String Valor,TipoResultado TipoComparacion, int IDValorC){
                this.Valor=Valor;
                this.TipoComparacion=TipoComparacion;
                this.IDValorC = IDValorC;
            }



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
    public int getIDValorC() {
        return IDValorC;
    }

    public void setIDValorC(int IDValorC) {
        this.IDValorC = IDValorC;
    }


}
