package Hello;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Action_07 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Action_07().Form();
	}
	DefaultTableModel model;
	JTable table;
	JScrollPane jsp;
	JCheckBox jc = new JCheckBox();
	JPanel mp;
	
	private void Form() {
		setTitle("¸Þ´º¼±ÅÃ");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(mp = new JPanel());
		
		String col[] = {"", "¸Þ´º¸í", "°¡°Ý", "¼ö·®"};
		Object row[][] = {{false, "°ø±â¹ä", 1000, 10}, {false, "Ä®±¹¼ö", 2000, 10}, {false, "±èÄ¡Âî°³", 5000, 2}, {false, "µÈÀåÂî°³", 6000, 1}, {false, "µ·±î½º", 1000, 2}};
		model = new DefaultTableModel(row, col);
		table = new JTable(model) {
			public Class<?> getColumnClass(int column) {
				switch (column) {
				case 0:
					return Boolean.class;
				default:
					return String.class;
				}
			}
		};
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(0);
		int w[] = {10, 100, 100, 100};
		for (int i = 0; i < table.getColumnCount(); i++) {
			if (i != 0)
				table.getColumnModel().getColumn(i).setCellRenderer(dtcr);
			table.getColumnModel().getColumn(i).setPreferredWidth(w[i]);
		}
		
		mp.add(jc = new JCheckBox());
		jc.addActionListener(this);
		mp.setLayout(null);
		jsp = new JScrollPane(table);
		mp.add(jsp);
		jsp.setBounds(0, 0, 500, 200);
		jc.setBounds(21, 2, 20, 20);
		
		mp.setPreferredSize(new Dimension(500, 200));
		
		pack();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < table.getRowCount(); i++) {
			if (jc.isSelected()) 
				table.setValueAt(true, i, 0);
			else
				table.setValueAt(false, i, 0);
		}
	}
}