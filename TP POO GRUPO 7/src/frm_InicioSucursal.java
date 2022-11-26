import javax.swing.*;

public class frm_InicioSucursal extends JInternalFrame {
    private JPanel panelPrincipal;

    public frm_InicioSucursal(){
        super("Inicio");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
    }
    }

