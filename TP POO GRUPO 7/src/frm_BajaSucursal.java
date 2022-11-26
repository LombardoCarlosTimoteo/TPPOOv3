import uade.edu.ar.controller.ControllerSucursal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_BajaSucursal extends JInternalFrame{
    private JPanel panelPrincipal;
    private JTextField textFieldNumeroSucursal;
    private JButton cancelarButton;
    private JButton eliminarButton;
    private frm_Sucursal self;
    ControllerSucursal controllerSucursal;

    {
        try {
            controllerSucursal = ControllerSucursal.getInstances();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public frm_BajaSucursal() {
    super("Baja Sucursal");
    setBorder(null);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setContentPane(panelPrincipal);
    asociarEventos();
    }

    private void asociarEventos(){
    this.self=self;
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int NRO = Integer.parseInt(textFieldNumeroSucursal.getText());
                controllerSucursal.EliminarSucursal(NRO);
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


//for (Paciente P : Sucursal.getPacienteAsociado()){
//        P.setSucursalAsociada(ListaSucursales.get(0));
//        }
