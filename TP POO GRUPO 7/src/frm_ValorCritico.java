import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_ValorCritico extends JInternalFrame{
    private JPanel panelPrincipal;
    private JButton altaButton;
    private JButton modificaciónButton;
    private JButton bajaButton;
    private JPanel desktopPaneEmbebidoValorCritico;

    public frm_ValorCritico() throws Exception{
        super("Valor Critico");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }
    public void asociarEventos()  throws Exception{
        frm_AltaValorCritico PantallaAltaVC = new frm_AltaValorCritico();
        frm_BajaValorCritico PantallaBajaVC = new frm_BajaValorCritico();// el error era por el throws Exception del BAja y alta
        frm_ModificacionValorCritico PantallaModificacionVC = new frm_ModificacionValorCritico();
        frm_InicioValorCritico PantallaInicio = new frm_InicioValorCritico();

        desktopPaneEmbebidoValorCritico.add(PantallaInicio);
        desktopPaneEmbebidoValorCritico.add(PantallaAltaVC);
        desktopPaneEmbebidoValorCritico.add(PantallaBajaVC);
        desktopPaneEmbebidoValorCritico.add(PantallaModificacionVC);

        PantallaInicio.setVisible(true);
        PantallaAltaVC.setVisible(false);
        PantallaBajaVC.setVisible(false);
        PantallaModificacionVC.setVisible(false);
        revalidate();
        repaint();
        altaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaVC.setVisible(true);
                PantallaBajaVC.setVisible(false);
                PantallaModificacionVC.setVisible(false);
                revalidate();
                repaint();
            }
        });
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaVC.setVisible(false);
                PantallaBajaVC.setVisible(true);
                PantallaModificacionVC.setVisible(false);
                revalidate();
                repaint();
            }
        });
        modificaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaVC.setVisible(false);
                PantallaBajaVC.setVisible(false);
                PantallaModificacionVC.setVisible(true);
                revalidate();
                repaint();
            }});
    }

}
