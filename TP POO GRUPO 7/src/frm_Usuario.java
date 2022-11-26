import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_Usuario extends JInternalFrame {
    private JPanel panel1;
    private JPanel panelPrincipal;
    private JButton modificaciónButton;
    private JButton bajaButton;
    private JButton altaButton;
    private JPanel desktopPaneEmbebido;

    public frm_Usuario() {
        super("Usuario");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel1);
        asociarEventos();
    }

    public void asociarEventos(){
        frm_AltaUsuario PantallaAltaUsuario = new frm_AltaUsuario();
        frm_BajaUsuario PantallaBajaUsuario = new frm_BajaUsuario();
        frm_ModificacionUsuario PantallaModificacionUsuario = new frm_ModificacionUsuario();
        frm_InicioUsuario PantallaInicio = new frm_InicioUsuario();

        desktopPaneEmbebido.add(PantallaInicio);
        desktopPaneEmbebido.add(PantallaAltaUsuario);
        desktopPaneEmbebido.add(PantallaBajaUsuario);
        desktopPaneEmbebido.add(PantallaModificacionUsuario);

        PantallaInicio.setVisible(true);
        PantallaAltaUsuario.setVisible(false);
        PantallaBajaUsuario.setVisible(false);
        PantallaModificacionUsuario.setVisible(false);

        revalidate();
        repaint();

        altaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaUsuario.setVisible(true);
                PantallaBajaUsuario.setVisible(false);
                PantallaModificacionUsuario.setVisible(false);
                revalidate();
                repaint();
            }
        });
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaAltaUsuario.setVisible(false);
                PantallaBajaUsuario.setVisible(true);
                PantallaModificacionUsuario.setVisible(false);
                PantallaInicio.setVisible(false);
                revalidate();
                repaint();
            }
        });
        modificaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaAltaUsuario.setVisible(false);
                PantallaBajaUsuario.setVisible(false);
                PantallaModificacionUsuario.setVisible(true);
                PantallaInicio.setVisible(false);
                revalidate();
                repaint();
            }
        });
    }
}
