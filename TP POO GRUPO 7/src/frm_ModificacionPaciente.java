import javax.swing.*;

import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.dto.PacienteDTO;
import uade.edu.ar.model.SexoPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class frm_ModificacionPaciente extends JInternalFrame{
    private JPanel panelPrincipal;
    private JTextField textFieldMail;
    private JTextField textFieldFechaNacimiento;
    private JTextField textFieldDNI;
    private JTextField textFieldDomicilio;
    private JTextField textFieldNombreUsuario;
    private JTextField textFieldNombreApellido;
    private JTextField textFieldContraseña;
    private JTextField textFieldEdad;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JComboBox comboBoxSexoPaciente;
    private PacienteDTO PDTO = new PacienteDTO( 0,"","","","","", "",0,false, SexoPaciente.Hombre);
    private ControllerPaciente controllerPaciente = ControllerPaciente.getInstances();
    private frm_ModificacionPaciente self;


    public frm_ModificacionPaciente() throws Exception {
        super("Modificacion Paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();


    }

    private void asociarEventos(){
        this.self = this;

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //Estaria bueno que DNI despliegue todos los DNI de los pacientes
                //elegir un paciente, que cada campo muestre sus datos. y modificar cualquiera.
                int DNI = Integer.parseInt(textFieldDNI.getText());

                String NombreApellido = textFieldNombreApellido.getText();
                String contraseña = textFieldContraseña.getText();
                String domicilio = textFieldDomicilio.getText();

                String fechaNacimiento = textFieldFechaNacimiento.getText();
                int edad = Integer.parseInt(textFieldEdad.getText());
                String mail = textFieldMail.getText();
                String sexo = comboBoxSexoPaciente.getSelectedItem().toString();
                String NombreUsuario = textFieldNombreUsuario.getText();
                if(sexo == "Hombre")PDTO.setSexo(SexoPaciente.Hombre);
                else {PDTO.setSexo(SexoPaciente.Mujer);}

                PDTO.setDNI(DNI);
                PDTO.setEdad(edad);
                PDTO.setDomicilio(domicilio);
                PDTO.setFechaNacimiento(fechaNacimiento);
                PDTO.setEmail(mail);
                //PDTO.setSexo(sexo);
                PDTO.setPassword(contraseña);
                PDTO.setNombre(NombreApellido);
                PDTO.setNombreUsuario(NombreUsuario);
                try {
                    controllerPaciente.ModificarPaciente(DNI,PDTO);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                textFieldContraseña.setText(null);
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
