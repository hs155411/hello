package Hello;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Action_02 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Action_02().Form();
	}
	
	Container con;
	JButton jb;
	JLabel jl;

	public void Form() {
		setSize(250, 100);
		setTitle("ActionListener");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		con = getContentPane();
		con.setLayout(new FlowLayout());
		String[] bn = {"����", "����", "����"};
		for (int i = 0; i < bn.length; i++) {
			con.add(jb = new JButton(bn[i]));
			jb.addActionListener(this);
		}
		con.add(jl = new JLabel("������ �����ϼ���."));
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("����"))
			jl.setText("���ڸ� �����Ͽ����ϴ�.");
		else if (arg0.getActionCommand().equals("����"))
			jl.setText("���ڸ� �����Ͽ����ϴ�.");
		else {
			JOptionPane.showMessageDialog(null, "�����մϴ�.", "Exit", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}	