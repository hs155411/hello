package Hello;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Mult_8 extends JFrame {
	public static void main(String[] args) {
		new Mult_8().Form();
	}
	
	JPanel mp, center, south, grid;
	JLabel jl;
	JButton jb;
	JComponent[][] jc = {
			{new JTextField(), new JTextField(), new JTextField(), new JPanel(new FlowLayout(FlowLayout.CENTER))}, 
			{new JTextField(), new JComboBox(), new JComboBox(), new JPanel(new FlowLayout(FlowLayout.CENTER))}};
	ButtonGroup[] bg = new ButtonGroup[2];
	JRadioButton[][] jr = new JRadioButton[2][2];
	
	public void Form() {
		setSize(500, 280);
		setTitle("���������Ȳ");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		
		add(mp = new JPanel(new BorderLayout(0, 5)));
		mp.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		mp.add(center = new JPanel(new GridLayout(1, 2)), BorderLayout.CENTER);
		String[] pn = {"�⺻ ����", "�μ� ����"};
		String[][] in = {{"�̸�", "�������", "��ȭ��ȣ", "����"}, {"���", "�μ�", "����", "���"}};
		
		for (int i = 0; i < pn.length; i++) {
			center.add(grid = new JPanel(new FlowLayout()));
			grid.setBorder(new TitledBorder(pn[i]));
			for (int j = 0; j < in[i].length; j++) {
				grid.add(jl = new JLabel(in[i][j]));
				jl.setPreferredSize(new Dimension(60, 30));
				
				grid.add(jc[i][j]);
				jc[i][j].setPreferredSize(new Dimension(150, 30));
			}
		}
		String[][] rn = {{"��", "��"}, {"����", "���"}};
		for (int i = 0; i < jc.length; i++) {
			bg[i] = new ButtonGroup();
			for (int j = 0; j < jr[i].length; j++) {
				((JPanel) jc[i][3]).add(jr[i][j] = new JRadioButton(rn[i][j]));
				bg[i].add(jr[i][j]);
			}
		}
		String[] cl1 = {"�λ��", "������", "�ѹ���", "�����"};
		((JComboBox) jc[1][1]).setModel(new DefaultComboBoxModel(cl1));
		String[] cl2 = {"���", "�븮", "����", "����", "����", "�̻�"};
		((JComboBox) jc[1][2]).setModel(new DefaultComboBoxModel(cl2));
	
		mp.add(south = new JPanel(new GridLayout(1, 2, 5, 0)), BorderLayout.SOUTH);
		String[] bn = {"����", "���"};
		for (int i = 0; i < bn.length; i++) 
			south.add(jb = new JButton(bn[i]));
		setVisible(true);
	}
}