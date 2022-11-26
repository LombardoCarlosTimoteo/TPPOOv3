import javax.swing.*;

public class frm_InicioUsuario extends JInternalFrame {
    private JPanel panel1;
    public frm_InicioUsuario() {
        super("Inicio");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel1);
    }
}
