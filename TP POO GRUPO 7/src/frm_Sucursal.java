import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_Sucursal extends JInternalFrame{
    private JButton listarPeticionesConValorButton;
    private JButton modificaciónButton;
    private JButton bajaButton;
    private JButton altaButton;
    private JPanel panelPrincipal;
    private JPanel desktopPaneEmbebido;

    public frm_Sucursal() {
        super("Sucursal");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }

    private void asociarEventos(){

        frm_AltaSucursal PantallaAltaSucursal = new frm_AltaSucursal();
        frm_BajaSucursal PantallaBajaSucursal = new frm_BajaSucursal();
        frm_ModificacionSucursal PantallaModificacionSucursal = new frm_ModificacionSucursal();
        frm_ListarValoresCriticosSucursal PantallaListarValoresCriticos = new frm_ListarValoresCriticosSucursal();
        frm_InicioSucursal PantallaInicio = new frm_InicioSucursal();

        desktopPaneEmbebido.add(PantallaInicio);
        desktopPaneEmbebido.add(PantallaAltaSucursal);
        desktopPaneEmbebido.add(PantallaBajaSucursal);
        desktopPaneEmbebido.add(PantallaModificacionSucursal);
        desktopPaneEmbebido.add(PantallaListarValoresCriticos);

        PantallaInicio.setVisible(true);
        PantallaAltaSucursal.setVisible(false);
        PantallaBajaSucursal.setVisible(false);
        PantallaModificacionSucursal.setVisible(false);
        PantallaListarValoresCriticos.setVisible(false);
        revalidate();
        repaint();




        altaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaSucursal.setVisible(true);
                PantallaBajaSucursal.setVisible(false);
                PantallaModificacionSucursal.setVisible(false);
                PantallaListarValoresCriticos.setVisible(false);
                revalidate();
                repaint();
            }
        });

        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaSucursal.setVisible(false);
                PantallaBajaSucursal.setVisible(true);
                PantallaModificacionSucursal.setVisible(false);
                PantallaListarValoresCriticos.setVisible(false);
                revalidate();
                repaint();
            }
        });

        modificaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaSucursal.setVisible(false);
                PantallaBajaSucursal.setVisible(false);
                PantallaModificacionSucursal.setVisible(true);
                PantallaListarValoresCriticos.setVisible(false);
                revalidate();
                repaint();
            }
        });

        listarPeticionesConValorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaSucursal.setVisible(false);
                PantallaBajaSucursal.setVisible(false);
                PantallaModificacionSucursal.setVisible(false);
                PantallaListarValoresCriticos.setVisible(true);
                revalidate();
                repaint();
            }
        });
    }
}

