import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm_Paciente extends JInternalFrame {
    private JPanel panelPrincipal;
    private JButton altaButton;
    private JButton obtenerResultadosDePracticaButton;
    private JButton bajaButton;
    private JButton modificaciónButton;
    private JPanel desktopPaneEmbebidoPaciente;

    public frm_Paciente() throws Exception {
        super("Paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panelPrincipal);
        asociarEventos();
    }


    private void asociarEventos() throws Exception {
        frm_AltaPaciente PantallaAltaPaciente = new frm_AltaPaciente();
        frm_BajaPaciente PantallaBajaPaciente = new frm_BajaPaciente();
        frm_ModificacionPaciente PantallaModificacionPaciente = new frm_ModificacionPaciente();
        frm_obtenerResultadosDePracticaPaciente PantallaobtenerResultadosDePracticaPaciente = new frm_obtenerResultadosDePracticaPaciente();
        frm_InicioPaciente PantallaInicio = new frm_InicioPaciente();

        desktopPaneEmbebidoPaciente.add(PantallaAltaPaciente);
        desktopPaneEmbebidoPaciente.add(PantallaBajaPaciente);
        desktopPaneEmbebidoPaciente.add(PantallaModificacionPaciente);
        desktopPaneEmbebidoPaciente.add(PantallaobtenerResultadosDePracticaPaciente);
        desktopPaneEmbebidoPaciente.add(PantallaInicio);

        PantallaInicio.setVisible(true);
        PantallaAltaPaciente.setVisible(false);
        PantallaBajaPaciente.setVisible(false);
        PantallaModificacionPaciente.setVisible(false);
        PantallaobtenerResultadosDePracticaPaciente.setVisible(false);

        revalidate();
        repaint();

        altaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaPaciente.setVisible(true);
                PantallaBajaPaciente.setVisible(false);
                PantallaModificacionPaciente.setVisible(false);
                PantallaobtenerResultadosDePracticaPaciente.setVisible(false);

                revalidate();
                repaint();
            }
        });
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaPaciente.setVisible(false);
                PantallaBajaPaciente.setVisible(true);
                PantallaModificacionPaciente.setVisible(false);
                PantallaobtenerResultadosDePracticaPaciente.setVisible(false);


                revalidate();
                repaint();
            }
        });
        modificaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaAltaPaciente.setVisible(false);
                PantallaBajaPaciente.setVisible(false);
                PantallaModificacionPaciente.setVisible(true);
                PantallaobtenerResultadosDePracticaPaciente.setVisible(false);
                revalidate();
                repaint();

            }
        });
        obtenerResultadosDePracticaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PantallaInicio.setVisible(false);
                PantallaobtenerResultadosDePracticaPaciente.setVisible(true);
                PantallaAltaPaciente.setVisible(false);
                PantallaBajaPaciente.setVisible(false);
                PantallaModificacionPaciente.setVisible(false);
                revalidate();
                repaint();

            }
        });
    }}
