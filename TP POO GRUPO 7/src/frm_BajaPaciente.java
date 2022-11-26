import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uade.edu.ar.controller.ControllerPaciente;

public class frm_BajaPaciente extends  JInternalFrame{
    private JTextField textFieldDNI;
    private JPanel panelPrincipal;
    private JButton eliminarButton;
    private JButton cancelarButton;
    private frm_BajaPaciente self;
    private ControllerPaciente controllerPaciente = ControllerPaciente.getInstances();

    public frm_BajaPaciente() throws Exception {
        super("Baja Paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();


    }

    private void asociarEventos(){
        this.self = this;

        eliminarButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int DNI = Integer.parseInt(textFieldDNI.getText());

                try {
                    ControllerPaciente.EliminarPaciente(DNI);
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
