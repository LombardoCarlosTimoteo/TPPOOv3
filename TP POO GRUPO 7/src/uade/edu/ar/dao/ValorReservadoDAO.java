package uade.edu.ar.dao;

import uade.edu.ar.model.clases.ValorReservado;
import uade.edu.ar.util.GenericDAO;

public class ValorReservadoDAO extends GenericDAO {

    public ValorReservadoDAO(Class<ValorReservado> clase, String file) throws Exception {//es una clase abstracta. y se pueden usar todos los metodos de genericDAO
        super(uade.edu.ar.model.clases.ValorReservado.class, "C:\\Users\\timoteo\\Desktop\\ValorReservadoDAO.txt");
    }
}