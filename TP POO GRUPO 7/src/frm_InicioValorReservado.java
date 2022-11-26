import javax.swing.*;

public class frm_InicioValorReservado extends JInternalFrame{
    private JPanel panelPrincipal;

    public frm_InicioValorReservado(){
        super("Inicio");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
    }
}
