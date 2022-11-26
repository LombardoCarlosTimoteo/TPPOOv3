package uade.edu.ar.dao;

import uade.edu.ar.model.clases.Paciente;
import uade.edu.ar.util.GenericDAO;

public class PacienteDAO extends GenericDAO {

    public PacienteDAO(Class<Paciente> clase, String file) throws Exception {//es una clase abstracta. y se pueden usar todos los metodos de genericDAO
        super(uade.edu.ar.model.clases.Paciente.class, "C:\\Users\\timoteo\\Desktop\\PacienteDAO.txt");
    }
}

