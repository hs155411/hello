package Hello;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class E_KeyListener_01 extends JFrame implements KeyListener  {
	public static void main(String[] args) {
		new E_KeyListener_01().Form();;
	}
	JLabel jl;
	public void Form() {
		setSize(230, 90);
		setTitle("KeyListener");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		addKeyListener(this);
		add(jl = new JLabel("키보드의 원하는 키를 입력해주세요."));
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		JOptionPane.showMessageDialog(null, "입력된 문자는 " + arg0.getKeyChar() + "입니다.");
	}

	@Override
	public void keyReleased(KeyEvent e) {}
}