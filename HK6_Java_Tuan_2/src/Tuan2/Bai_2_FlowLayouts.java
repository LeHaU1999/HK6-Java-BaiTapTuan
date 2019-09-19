package Tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai_2_FlowLayouts extends  JFrame{
	public Bai_2_FlowLayouts () {
		setTitle("Flow Layout");
		setVisible(true);
		setSize(450, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		// tạo Pannel
		JPanel pnFlow = new JPanel();						// tọa một đối tượng pannel mới
		pnFlow.setLayout(new FlowLayout());
		
		//Tạo các Button
		JButton btn1 = new JButton("Button 1");
		btn1.setForeground(Color.MAGENTA);
		JButton btn2 = new JButton("Button 2");
		btn2.setForeground(Color.MAGENTA);
		JButton btn3 = new JButton("Button 3");
		btn3.setForeground(Color.MAGENTA);
		JButton btn4 = new JButton("Button 4");
		btn4.setForeground(Color.MAGENTA);
		JButton btn5 = new JButton("Button 5");
		btn5.setForeground(Color.MAGENTA);
		
		// add các button vào pannel
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		pnFlow.add(btn3);
		pnFlow.add(btn4);
		pnFlow.add(btn5);
		
		//add pannel vào form
		add(pnFlow);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai_2_FlowLayouts FLow = new Bai_2_FlowLayouts();
	}

}
