package Hello;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Action_08 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Action_08().Form();
	}
	JMenuBar bar;
	JMenu jm;
	JMenuItem item[] = new JMenuItem[4];
	
	private void Form() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(bar = new JMenuBar(), BorderLayout.NORTH);
		jm = new JMenu("����� �޴�");
		String mu[] = {"�Է�", "����", "����", "����"};
		for (int i = 0; i < mu.length; i++) {
			jm.add(item[i] = new JMenuItem(mu[i]));
			jm.addSeparator();
		}
		bar.add(jm);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item[0]) 
			JOptionPane.showMessageDialog(null, "�Է������� �̵��մϴ�.");
		else if (e.getSource() == item[1])
			JOptionPane.showMessageDialog(null, "���������� �̵��մϴ�.");
		else if (e.getSource() == item[2])
			JOptionPane.showMessageDialog(null, "���������� �̵��մϴ�.");
		else {
			JOptionPane.showMessageDialog(null, "�����մϴ�.");
			System.exit(0);
		}
	}
}