package Hello;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class E_Thread_03 extends JFrame implements Runnable {
	public static void main(String[] args) {
		new E_Thread_03().FrameLay();
	}
	
	JPanel north;
	JLabel im, la;
	JButton jb;
	Thread th = new Thread(this);
	int cnt = 0;
	DefaultTableModel model;
	JTable table;
	JScrollPane jsp;
	JTextField jt;
	
	public void FrameLay() {
		setTitle("학점 현황");
		setDefaultCloseOperation(2);
		setSize(450, 250);
		add(north = new JPanel(new FlowLayout()), BorderLayout.NORTH);
		north.add(la = new JLabel("점수 : "));
		north.add(jt = new JTextField(10));
		north.add(jb = new JButton("확인"));
		jt.setText("0");
		String col[] = {"번호", "이름", "성적"};
		Object data[][] = {{1, "홍길동", 100}, {2, "이순신", 60}, {3, "유관순", 80}};
		model = new DefaultTableModel(data, col);
		table = new JTable(model);
		add(jsp = new JScrollPane(table), BorderLayout.CENTER);
		setVisible(true);
		th.start();
	}

	@Override
	public void run() {
	while (true) {
	try {
		cnt++;
		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				setHorizontalAlignment(0);
				setBackground(java.awt.Color.white);
				if (Integer.parseInt(table.getValueAt(row, 2).toString()) >= Integer.parseInt(jt.getText()))
					setBackground(cnt % 2 == 0 ? Color.yellow : Color.white);
				return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			}
			
		});
		table.repaint();
		th.sleep(1000);
	} catch (Exception e) {
				e.printStackTrace();
			}
	}
	}
}