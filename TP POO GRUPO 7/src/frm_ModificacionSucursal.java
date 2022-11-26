import uade.edu.ar.controller.ControllerSucursal;
import uade.edu.ar.dto.SucursalDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_ModificacionSucursal extends JInternalFrame{
    private JPanel panelPrincipal;
    private JTextField textFieldNumeroSucursal;
    private JTextField textFieldDireccion;
    private JTextField textFieldResponsableTecnico;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private SucursalDTO SDTO = new SucursalDTO(0, "", "", false);
    private ControllerSucursal controllerSucursal;

    {
        try {
            controllerSucursal = ControllerSucursal.getInstances();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public frm_ModificacionSucursal() {
        super("Modificacion Sucursal");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }

    public void asociarEventos(){
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Reesp = textFieldResponsableTecnico.getText();
                String dir = textFieldDireccion.getText();
                int nro = Integer.parseInt(textFieldNumeroSucursal.getText());

                SDTO.setDireccion(dir);
                SDTO.setResponsableTecnico(Reesp);
                SDTO.setNumero(nro);

                controllerSucursal.ModificarSucursal(nro, SDTO);
            }
        });
    }
}
