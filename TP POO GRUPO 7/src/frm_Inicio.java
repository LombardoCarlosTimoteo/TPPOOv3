import javax.swing.*;

public class frm_Inicio extends JInternalFrame {
    private JPanel PanelPrincipal;

    public frm_Inicio() {
        super("Inicio");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(PanelPrincipal);
    }
}
