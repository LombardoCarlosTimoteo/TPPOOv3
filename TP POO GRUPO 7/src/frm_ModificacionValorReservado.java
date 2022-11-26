import uade.edu.ar.controller.ControllerValorReservado;
import uade.edu.ar.dto.ValorReservadoDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_ModificacionValorReservado extends JInternalFrame{
    private JTextField textFieldValorReservadoID;
    private JTextField textFieldValor;
    private JTextField textFieldTipoComparacion;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JPanel panelPrincipal;

    ControllerValorReservado controllerValorReservado = ControllerValorReservado.getInstances();

    ValorReservadoDTO VRDTO = new ValorReservadoDTO();

    private frm_ModificacionValorReservado self;

    public frm_ModificacionValorReservado() throws Exception {
        super("Valor Reservado");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        asociarEventos();

    }
    public void asociarEventos(){
        this.self = self;
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textFieldValorReservadoID.getText());
                String valor = textFieldValor.getText();
                String tipo = textFieldTipoComparacion.getText();

                //VRDTO.setTipoComparacion(tipo);
                VRDTO.setValor(valor);


                controllerValorReservado.ModificarValorR(id, VRDTO);


            }
        });
    }
}
//CREO QUE FALTA EL PANEL PRINCIPAL
