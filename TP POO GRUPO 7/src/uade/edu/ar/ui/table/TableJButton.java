package uade.edu.ar.ui.table;

import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.dto.PacienteDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TableJButton extends JFrame {

    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private String[] columns = new String[3];
    private String[][] data = new String[3][3];
    JButton button = new JButton();
    ControllerPaciente controller =  null;

    public TableJButton() throws Exception {
        setTitle("Model Table with button");
        setSize(300,150);
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columns = new String[] {"Id", "Name","Action"};
        controller = ControllerPaciente.getInstances();
        data = convertDtoToData(controller.getAll());
        DefaultTableModel model = new DefaultTableModel(data,columns);
        table = new JTable();
        table.setModel(model);
        table.getColumn("Action").setCellRenderer(new ButtonRenderer());
        table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox()));
        scrollPane = new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);

        button.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        JOptionPane.showMessageDialog(null,"Â¿Quiere modificar el registro?");
                    }
                }
        );
    }
    class ButtonRenderer extends JButton implements TableCellRenderer
    {
        public ButtonRenderer() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Modificar" : value.toString());
            return this;
        }
    }
    class ButtonEditor extends DefaultCellEditor
    {
        private String label;

        public ButtonEditor(JCheckBox checkBox)
        {
            super(checkBox);
        }
        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column)
        {
            label = (value == null) ? "Modificar" : value.toString();
            button.setText(label);
            return button;
        }
        public Object getCellEditorValue()
        {
            return new String(label);
        }
    }

    public String[][] convertDtoToData(ArrayList<PacienteDTO> list) {
        String[][] data = new String[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = Integer.toString(list.get(i).getDNI());
            data[i][1] = list.get(i).getNombreUsuario();
        }
        return data;
    }

    public static void main(String args[]) throws Exception {
        TableJButton f = new TableJButton();
        f.setVisible(true);
    }
}
