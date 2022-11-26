package uade.edu.ar.dto;

import uade.edu.ar.model.TipoResultado;
import uade.edu.ar.model.clases.Practica;

public class ValorReservadoDTO {
        //DEFINIR ATRIBUTOS
        private int IDValorR;

        private String Valor;

        private TipoResultado TipoComparacion;

        //DEFINIR RELACIONES

        private Practica PracticaAsociada;

        //DEFINIR METODOS
        //CONSTRUCTOR
        public ValorReservadoDTO() {}

    public ValorReservadoDTO(String valor, TipoResultado tipoComparacion, int IDValorR) {
        this.setValor(valor);
        this.setIDValorR(IDValorR);
        this.setTipoComparacion(tipoComparacion);
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
    public int getIDValorR() {
        return IDValorR;
    }

    public void setIDValorR(int IDValorR) {
        this.IDValorR = IDValorR;
    }

}
