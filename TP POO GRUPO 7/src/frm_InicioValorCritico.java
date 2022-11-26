import javax.swing.*;

public class frm_InicioValorCritico extends JInternalFrame{
    private JPanel panelPrincipal;
    public frm_InicioValorCritico() {
        super("Inicio");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
    }
}
