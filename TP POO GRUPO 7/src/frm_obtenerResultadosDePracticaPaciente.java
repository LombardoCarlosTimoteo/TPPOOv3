import uade.edu.ar.controller.ControllerPaciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_obtenerResultadosDePracticaPaciente extends JInternalFrame {

    private JTextField textFieldDNI;
    private JTextField textFieldPracticaID;
    private JPanel panelPrincipal;
    private JButton mostrarButton;
    private JButton cancelarButton;

    private ControllerPaciente controllerPaciente = ControllerPaciente.getInstances();

    private frm_obtenerResultadosDePracticaPaciente self;
    public frm_obtenerResultadosDePracticaPaciente() throws Exception {
        super("Alta Paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();


    }

    private void asociarEventos(){
        this.self = this;

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int DNI = Integer.parseInt(textFieldDNI.getText());
                String PracticaID = textFieldPracticaID.getText();
                controllerPaciente.mostrarResultadoPractica(PracticaID,DNI);
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
