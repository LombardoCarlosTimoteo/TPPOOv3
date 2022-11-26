import uade.edu.ar.controller.ControllerSucursal;
import uade.edu.ar.dto.SucursalDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_AltaSucursal extends  JInternalFrame{
    private JTextField textFieldResponsableTecnico;
    private JTextField textFieldNumeroSucursal;
    private JTextField textFieldDireccion;
    private JPanel panelPrincipal;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private frm_AltaSucursal self;
    private SucursalDTO SDTO = new SucursalDTO(0, "", "", false);
    private ControllerSucursal controllerSucursal;

    {
        try {
            controllerSucursal = ControllerSucursal.getInstances();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public frm_AltaSucursal() {
        super("Alta Sucursal");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }

    private void asociarEventos(){
        this.self=this;



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

                try {
                    controllerSucursal.GuardarSucursal(SDTO);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }
}
