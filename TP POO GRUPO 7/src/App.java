import uade.edu.ar.controller.ControllerPaciente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class App {

    public static void main(String[] args) throws Exception {
        try {
            ControllerPaciente controller = ControllerPaciente.getInstances();
        } catch (Exception e) {
            e.printStackTrace();
        }

        frm_MenuPrincipal win = new frm_MenuPrincipal();
        win.setVisible(true);
    }
}
