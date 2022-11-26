package uade.edu.ar.dto;
import uade.edu.ar.model.clases.Peticion;
import uade.edu.ar.model.clases.Practica;

public class ResultadoDTO {

    //DEFINIR ATRIBUTOS

    private String Valor;

    private int IDResultado;

    //DEFINIR RELACIONES

    private Practica PracticaAsociada;

    private Peticion PeticionAsociada;




    //DEFINIR METODOS

    //GETTERS/SETTERS

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public int getIDResultado() {
        return IDResultado;
    }

    public void setIDResultado(int IDResultado) {
        this.IDResultado = IDResultado;
    }

    public Practica getPracticaAsociada() {
        return PracticaAsociada;
    }

    public void setPracticaAsociada(Practica practicaAsociada) {
        PracticaAsociada = practicaAsociada;
    }

    public Peticion getPeticionAsociada() {
        return PeticionAsociada;
    }

    public void setPeticionAsociada(Peticion peticionAsociada) {
        PeticionAsociada = peticionAsociada;
    }

    public ResultadoDTO(String Valor,int IDResultado, Practica PracticaAsociada, Peticion PeticionAsociada){
        this.Valor = Valor;
        this.IDResultado = IDResultado;
        this.PracticaAsociada = PracticaAsociada;
        this.PeticionAsociada = PeticionAsociada;
    }
    public boolean EsReservado (String comparacion, String valorComparacion, String Valor, boolean hacer){


        //COMPARAMOS CADA VALOR DE RESULTADO CON CADA VALOR DE VALOR RESULTADO
        if (comparacion == "Booleano") {
            if (Valor == valorComparacion) hacer = true;
        } else if (comparacion == "Umbral") {
            if (Integer.parseInt(Valor) > Integer.parseInt(valorComparacion)) hacer = true;
        } else if (comparacion == "Lista") {
            if (valorComparacion.contains(Valor)) hacer = true;
        } else if (comparacion == "Rango") {
            String[] listaRango = valorComparacion.split("-");
            if (Integer.parseInt(Valor) > Integer.parseInt(listaRango[0]) && Integer.parseInt(Valor) < Integer.parseInt(listaRango[1])) hacer = true;
        }
        return hacer;
    }

}
