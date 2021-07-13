package Hello;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_KeyListener_02 extends JFrame implements KeyListener {
	public static void main(String[] args) {
		new E_KeyListener_02().Form();
	}
	JPanel mp;
	JLabel jl;
	
	public void Form() {
		setSize(250, 80);
		setTitle("KeyListener");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		addKeyListener(this);
		add(mp = new JPanel());
		mp.add(jl = new JLabel("", JLabel.CENTER));
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		jl.setText(jl.getText() + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}	
}