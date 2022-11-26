import uade.edu.ar.controller.ControllerValorCritico;
import uade.edu.ar.dto.ValorCriticoDTO;
import uade.edu.ar.model.TipoResultado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_ModificacionValorCritico extends JInternalFrame{
    private JPanel panelPrincipal;
    private JTextField textFieldValor;
    private JTextField textFieldIDValorCritico;
    private JTextField textFieldTipoComparacion;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private frm_ModificacionValorCritico self;

    ControllerValorCritico controllerValorCritico = ControllerValorCritico.getInstances();

    private ValorCriticoDTO VCDTO = new ValorCriticoDTO(0, "", TipoResultado.Booleano);

    public frm_ModificacionValorCritico() throws Exception{
        super("Modificacion Paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }
    public void asociarEventos() {
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
                int id = Integer.parseInt(textFieldIDValorCritico.getText());
                String valor = textFieldValor.getText();
                //TipoResultado tipo = textFieldTipoComparacion.getText();

                VCDTO.setValor(valor);
                //VCDTO.setTipoComparacion(tipo);

                //controllerValorCritico.ModificarValorCritico(id, VCDTO);

            }
        });
    }
}
