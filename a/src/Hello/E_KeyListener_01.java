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
		add(jl = new JLabel("Ű������ ���ϴ� Ű�� �Է����ּ���."));
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		JOptionPane.showMessageDialog(null, "�Էµ� ���ڴ� " + arg0.getKeyChar() + "�Դϴ�.");
	}

	@Override
	public void keyReleased(KeyEvent e) {}
}