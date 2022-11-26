import uade.edu.ar.controller.ControllerValorCritico;
import uade.edu.ar.dto.ValorCriticoDTO;
import uade.edu.ar.model.TipoResultado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_BajaValorCritico extends JInternalFrame{
    private JTextField textFieldIDValorCritico;
    private JButton eliminarButton;
    private JButton cancelarButton;
    private JPanel panelPrincipal;

    private frm_BajaValorCritico self;

    ValorCriticoDTO VCDTO = new ValorCriticoDTO(0, "", TipoResultado.Booleano);

    ControllerValorCritico controllerValorCritico = ControllerValorCritico.getInstances();

    public frm_BajaValorCritico() throws Exception {
        super("Baja Paciente");
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
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(textFieldIDValorCritico.getText());
                controllerValorCritico.EliminarVC(ID);
            }
        });
    }
}
