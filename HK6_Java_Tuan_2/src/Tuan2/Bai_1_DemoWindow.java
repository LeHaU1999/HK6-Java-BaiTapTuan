package Tuan2;

import java.awt.Color;

import javax.swing.JFrame;

public class Bai_1_DemoWindow extends JFrame{
	public Bai_1_DemoWindow() {
		setTitle("Demo Pannel-Flow app");
		setVisible(true);
		setSize(450, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai_1_DemoWindow DmW = new Bai_1_DemoWindow();
	}
}
