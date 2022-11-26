package uade.edu.ar.dao;

import uade.edu.ar.model.clases.ValorCritico;
import uade.edu.ar.util.GenericDAO;

public class ValorCriticoDAO extends GenericDAO {

    public ValorCriticoDAO(Class<ValorCritico> clase, String file) throws Exception {//es una clase abstracta. y se pueden usar todos los metodos de genericDAO
        super(uade.edu.ar.model.clases.ValorCritico.class, "C:\\Users\\timoteo\\Desktop\\ValorCriticoDAO.txt");
    }
}