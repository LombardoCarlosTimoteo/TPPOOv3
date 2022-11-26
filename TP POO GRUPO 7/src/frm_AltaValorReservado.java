import uade.edu.ar.controller.ControllerValorReservado;
import uade.edu.ar.dto.ValorReservadoDTO;
import uade.edu.ar.model.TipoResultado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_AltaValorReservado extends JInternalFrame{
    private JTextField textFieldValorReservadoID;
    private JTextField textFieldTipoComparacion;
    private JTextField textFieldValor;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JPanel panelPrincipal;
    private frm_AltaValorReservado self;

    private ValorReservadoDTO VRDTO = new ValorReservadoDTO("", TipoResultado.Booleano, 0);

    private ControllerValorReservado controllerValorReservado = ControllerValorReservado.getInstances();

    public frm_AltaValorReservado() throws Exception{
        super("Alta Valor Reservado");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();


    }
    public void asociarEventos() {
        this.self=this;

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textFieldValorReservadoID.getText());
                String valor = textFieldValor.getText();
                //TipoResultado tipo = textFieldTipoComparacion.getText();


                VRDTO.setValor(valor);
                VRDTO.setIDValorR(id);
                //VRDTO.setTipoComparacion(tipo);

                try {
                    controllerValorReservado.GuardarValorReservado(VRDTO);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                dispose();
                dispose();
                System.out.println("cancelar");
            }
        });
    }
}
