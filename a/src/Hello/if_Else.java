package Hello;

import javax.swing.JOptionPane;

public class if_Else {

	public static void main(String[] args) {
		String gender;
		gender = JOptionPane.showInputDialog("����");
		if (gender.equals("����"))
			JOptionPane.showMessageDialog(null, "�����Դϴ�.");
		else
			JOptionPane.showMessageDialog(null, "���ڰ� �ƴմϴ�.");
	}
}