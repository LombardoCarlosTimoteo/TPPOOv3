import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_ListarValoresCriticosSucursal extends JInternalFrame {
    private JButton realizarButton;
    private JButton cancelarButton;
    private JPanel panelPrincipal;

    private frm_ListarValoresCriticosSucursal self;

    public frm_ListarValoresCriticosSucursal() {
        super("ListarValoresCriticos Sucursal");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();

    }

    private void asociarEventos(){
        this.self=self;
        realizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
