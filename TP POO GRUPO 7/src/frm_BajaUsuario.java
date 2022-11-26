import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.controller.ControllerUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_BajaUsuario extends JInternalFrame {
    private JPanel panelPrincipal;
    private JTextField textFieldDNI;
    private JButton eliminarButton;
    private JButton cancelarButton;
    private frm_BajaUsuario self;


    public frm_BajaUsuario() {
        super("Baja Usuario");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }

    private void asociarEventos(){
        this.self=this;
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int DNI = Integer.parseInt(textFieldDNI.getText());

                try {
                    ControllerUsuario.EliminarUsuario(DNI);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}


