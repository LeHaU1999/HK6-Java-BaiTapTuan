package Tuan2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai_3_BoxLayouts extends JFrame {
	
	public Bai_3_BoxLayouts() {
		setTitle("Box Layout");
		setVisible(true);
		setSize(450, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);

		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));

		// Tạo các Button
		JButton btn1 = new JButton("Button 1");
		btn1.setForeground(Color.MAGENTA);
		Font font1 =new Font("French Script MT",Font.BOLD | Font.ITALIC  , 20);
		btn1.setFont(font1);
		
		JButton btn2 = new JButton("Button 2");
		btn2.setForeground(Color.MAGENTA);
		Font font2 =new Font("Book Antiqua",Font.BOLD | Font.ITALIC  , 25);
		btn2.setFont(font2);
		
		JButton btn3 = new JButton("Button 3");
		btn3.setForeground(Color.MAGENTA);
		btn3.setFont(font1);
		
		JButton btn4 = new JButton("Button 4");
		btn4.setForeground(Color.MAGENTA);
		btn4.setFont(font2);
		
		JButton btn5 = new JButton("Button 5");
		btn5.setForeground(Color.MAGENTA);

		// add các button vào pannel
		pnBox.add(btn1);
		pnBox.add(btn2);
		pnBox.add(btn3);
		pnBox.add(btn4);
		pnBox.add(btn5);
		
		add(pnBox);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai_3_BoxLayouts Box = new  Bai_3_BoxLayouts();
	}

}
