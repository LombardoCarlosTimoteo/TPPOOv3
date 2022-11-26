import uade.edu.ar.controller.ControllerUsuario;
import uade.edu.ar.dto.UsuarioDTO;
import uade.edu.ar.model.RolUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_AltaUsuario extends JInternalFrame{
    private JPanel panelPrincipal;
    private JTextField textFieldDNI;
    private JTextField textFieldFechaNacimiento;
    private JTextField textFieldNombreUsuario;
    private JTextField textFieldDomicilio;
    private JTextField textFieldContraseña;
    private JTextField textFieldNombreApellido;
    private JButton cancelarButton;
    private JButton aceptarButton;
    private JTextField textFieldMail;
    private JComboBox comboBoxRolUsuario;
    private frm_AltaUsuario self;
    private UsuarioDTO UDTO = new UsuarioDTO(0, "", "", "", "", "", "", RolUsuario.Recepcionista);
    private ControllerUsuario controllerUsuario;

    {
        try {
            controllerUsuario = ControllerUsuario.getInstances();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public frm_AltaUsuario() {
        super("Alta Usuario");
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
                String NombreApellido = textFieldNombreApellido.getText();
                String contraseña = textFieldContraseña.getText();
                String domicilio = textFieldDomicilio.getText();
                String fechaNacimiento = textFieldFechaNacimiento.getText();
                String mail = textFieldMail.getText();
                String NombreUsuario = textFieldNombreUsuario.getText();
               String rolUsuario = comboBoxRolUsuario.getSelectedItem().toString();

               if(rolUsuario == "Administrador") UDTO.setRol(RolUsuario.Administrador);
                if(rolUsuario == "Recepcionista") UDTO.setRol(RolUsuario.Recepcionista);
                if(rolUsuario == "Laboratorista") UDTO.setRol(RolUsuario.Laboratorista);
                UDTO.setDNI(DNI);
                UDTO.setDomicilio(domicilio);
                UDTO.setFechaNacimiento(fechaNacimiento);
                UDTO.setEmail(mail);
                UDTO.setPassword(contraseña);
                UDTO.setNombre(NombreApellido);
                UDTO.setNombreUsuario(NombreUsuario);

                try {
                    controllerUsuario.GuardarUsuario(UDTO);

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
