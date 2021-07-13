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
		jm = new JMenu("사용자 메뉴");
		String mu[] = {"입력", "수정", "삭제", "종료"};
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
			JOptionPane.showMessageDialog(null, "입력폼으로 이동합니다.");
		else if (e.getSource() == item[1])
			JOptionPane.showMessageDialog(null, "수정폼으로 이동합니다.");
		else if (e.getSource() == item[2])
			JOptionPane.showMessageDialog(null, "삭제폼으로 이동합니다.");
		else {
			JOptionPane.showMessageDialog(null, "종료합니다.");
			System.exit(0);
		}
	}
}