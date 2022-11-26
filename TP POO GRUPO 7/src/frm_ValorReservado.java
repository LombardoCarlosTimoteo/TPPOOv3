import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_ValorReservado extends JInternalFrame{
    private JPanel panelPrincipal;
    private JButton modificaciónButton;
    private JButton bajaButton;
    private JButton altaButton;
    private JPanel desktopPaneEmbebido;

    public frm_ValorReservado() throws Exception {
        super("Valor Reservado");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }
    public void asociarEventos()throws Exception{
        frm_AltaValorReservado PantallaAltaVR = new frm_AltaValorReservado();
        frm_InicioValorReservado PantallaInicio = new frm_InicioValorReservado();
        frm_BajaValorReservado PantallaBajaVR = new frm_BajaValorReservado();
        frm_ModificacionValorReservado PantallaModificacionVR = new frm_ModificacionValorReservado();

        desktopPaneEmbebido.add(PantallaAltaVR);
        desktopPaneEmbebido.add(PantallaInicio);
        desktopPaneEmbebido.add(PantallaBajaVR);
        desktopPaneEmbebido.add(PantallaModificacionVR);

        PantallaBajaVR.setVisible(false);
        PantallaAltaVR.setVisible(false);
        PantallaInicio.setVisible(true);
        PantallaModificacionVR.setVisible(false);

        revalidate();
        repaint();


        altaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PantallaBajaVR.setVisible(false);
                PantallaAltaVR.setVisible(true);
                PantallaInicio.setVisible(false);
                PantallaModificacionVR.setVisible(false);

                revalidate();
                repaint();
            }
        });
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PantallaBajaVR.setVisible(true);
                PantallaAltaVR.setVisible(false);
                PantallaInicio.setVisible(false);
                PantallaModificacionVR.setVisible(false);

                revalidate();
                repaint();
            }
        });
        modificaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PantallaBajaVR.setVisible(false);
                PantallaAltaVR.setVisible(false);
                PantallaInicio.setVisible(false);
                PantallaModificacionVR.setVisible(true);

                revalidate();
                repaint();
            }
        });
        PantallaInicio.setVisible(true);

    }

}
