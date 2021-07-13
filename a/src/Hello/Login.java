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
		setTitle("로그인");
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
		if (arg0.getActionCommand().equals("확인")) {
			if (jt[0].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
				jt[0].requestFocus();
			} else if (jt[1].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				jt[1].requestFocus();
			} else if (jt[0].getText().equals("admin") && jt[1].getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "로그인 정보가 일치하지 않습니다.");
				for (int i = 0; i < jt.length; i++) 
					jt[i].setText("");
				jt[0].requestFocus();
			}
		} else if (arg0.getActionCommand().equals("취소"))
			dispose();
	}
}