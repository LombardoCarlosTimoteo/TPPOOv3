import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.dto.PacienteDTO;
import uade.edu.ar.model.SexoPaciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_AltaPaciente extends JInternalFrame{
    private JTextField textFieldDNI;
    private JTextField textFieldEdad;
    private JTextField textFieldFechaNacimiento;
    private JTextField textFieldNombreUsuario;
    private JTextField textFieldContraseña;
    private JTextField textFieldNombreyApellido;
    private JTextField textFieldDomicilio;
    private JPanel panelPrincipal;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JTextField textFieldMail;
    private JComboBox comboBoxSexo;
    private PacienteDTO PDTO = new PacienteDTO( 0,"","","","","", "",0,false, SexoPaciente.Hombre);

    private ControllerPaciente controllerPaciente = ControllerPaciente.getInstances();

    private frm_AltaPaciente self;
    public frm_AltaPaciente() throws Exception {
        super("Alta Paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();


    }

    public void asociarEventos(){
        this.self = this;
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int DNI = Integer.parseInt(textFieldDNI.getText());
                String NombreApellido = textFieldNombreyApellido.getText();
                String contraseña = textFieldContraseña.getText();
                String domicilio = textFieldDomicilio.getText();

                String fechaNacimiento = textFieldFechaNacimiento.getText();
                int edad = Integer.parseInt(textFieldEdad.getText());
                String mail = textFieldMail.getText();

                String NombreUsuario = textFieldNombreUsuario.getText();
                String sexo = comboBoxSexo.getSelectedItem().toString();
                if(sexo == "Hombre")PDTO.setSexo(SexoPaciente.Hombre);
                else {PDTO.setSexo(SexoPaciente.Mujer);}

                PDTO.setDNI(DNI);
                PDTO.setEdad(edad);
                PDTO.setDomicilio(domicilio);
                PDTO.setFechaNacimiento(fechaNacimiento);
                PDTO.setEmail(mail);

                PDTO.setPassword(contraseña);
                PDTO.setNombre(NombreApellido);
                PDTO.setNombreUsuario(NombreUsuario);

                try {
                    controllerPaciente.GuardarPaciente(PDTO);
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
