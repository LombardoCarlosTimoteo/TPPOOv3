import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_MenuPrincipal extends JFrame {
    private JPanel panelPrincipal;
    private JButton valorCríticoButton;
    private JButton valorReservadoButton;
    private JButton Paciente;
    private JButton usuarioButton;
    private JButton sucursalButton;
    private JPanel desktopPaneEmbebido;

    public frm_MenuPrincipal() throws Exception {
        super("Menu Principal");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setContentPane(panelPrincipal);
        asociarEventos();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }


    private void asociarEventos() throws Exception {

        frm_Paciente PantallaPaciente = new frm_Paciente();
        frm_Sucursal PantallaSucursal = new frm_Sucursal();
        frm_ValorCritico PantallaValorC = new frm_ValorCritico();
        frm_ValorReservado PantallaValorR = new frm_ValorReservado();
        frm_Usuario PantallaUsuario = new frm_Usuario();
        frm_Inicio PantallaInicio = new frm_Inicio();
        frm_AltaPaciente PantallAltaPaciente = new frm_AltaPaciente();




        desktopPaneEmbebido.add(PantallaPaciente);
        desktopPaneEmbebido.add(PantallaSucursal);
        desktopPaneEmbebido.add(PantallaValorC);
        desktopPaneEmbebido.add(PantallaValorR);
        desktopPaneEmbebido.add(PantallaUsuario);
        desktopPaneEmbebido.add(PantallaInicio);
        desktopPaneEmbebido.add(PantallAltaPaciente);

        PantallaInicio.setVisible(true);
        PantallaPaciente.setVisible(false);
        PantallaUsuario.setVisible(false);
        PantallaValorR.setVisible(false);
        PantallaValorC.setVisible(false);
        PantallaSucursal.setVisible(false);
        PantallAltaPaciente.setVisible(false);

        revalidate();
        repaint();


        //frm_Paciente PantallaPaciente = new frm_Paciente();
        Paciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaPaciente.setVisible(true);
                PantallaUsuario.setVisible(false);
                PantallaValorR.setVisible(false);
                PantallaValorC.setVisible(false);
                PantallaSucursal.setVisible(false);
                revalidate();
                repaint();
            }
        });

        usuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaPaciente.setVisible(false);
                PantallaUsuario.setVisible(true);
                PantallaValorR.setVisible(false);
                PantallaValorC.setVisible(false);
                PantallaSucursal.setVisible(false);
                revalidate();
                repaint();
            }
        });

        sucursalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaPaciente.setVisible(false);
                PantallaUsuario.setVisible(false);
                PantallaValorR.setVisible(false);
                PantallaValorC.setVisible(false);
                PantallaSucursal.setVisible(true);
                revalidate();
                repaint();
            }
        });

        valorCríticoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaPaciente.setVisible(false);
                PantallaUsuario.setVisible(false);
                PantallaValorR.setVisible(false);
                PantallaValorC.setVisible(true);
                PantallaSucursal.setVisible(false);
                revalidate();
                repaint();

            }
        });

        valorReservadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaPaciente.setVisible(false);
                PantallaUsuario.setVisible(false);
                PantallaValorR.setVisible(true);
                PantallaValorC.setVisible(false);
                PantallaSucursal.setVisible(false);
                revalidate();
                repaint();

            }
        });
    }
}

