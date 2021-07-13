package Hello;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Login().Form();
	}
	Container con;
	JButton jb;
	JLabel jl;
	JTextField[] jt;
	public void Form() {
		setSize(150, 100);
		setTitle("�α���");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		
		con = getContentPane();
		con.setLayout(new FlowLayout());
		String[] in = {"ID", "PW"};
		for (int i = 0; i < in.length; i++) {
			con.add(jl = new JLabel(in[i]));
			jl.setPreferredSize(new Dimension(30, 20));
			if (i == 0) 
				con.add(jt[i] = new JTextField(10));
			else
				con.add(jt[i] = new JPasswordField(10));
		}
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("Ȯ��")) {
			if (jt[0].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
				jt[0].requestFocus();
			} else if (jt[1].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.");
				jt[1].requestFocus();
			} else if (jt[0].getText().equals("admin") && jt[1].getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "�α��� �Ǿ����ϴ�.");
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "�α��� ������ ��ġ���� �ʽ��ϴ�.");
				for (int i = 0; i < jt.length; i++) 
					jt[i].setText("");
				jt[0].requestFocus();
			}
		} else if (arg0.getActionCommand().equals("���"))
			dispose();
	}
}