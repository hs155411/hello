package Hello;

import javax.swing.JOptionPane;

public class if_Else {

	public static void main(String[] args) {
		String gender;
		gender = JOptionPane.showInputDialog("성별");
		if (gender.equals("남자"))
			JOptionPane.showMessageDialog(null, "남자입니다.");
		else
			JOptionPane.showMessageDialog(null, "남자가 아닙니다.");
	}
}