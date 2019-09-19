package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai_4_BorderLayout extends JFrame{
	public Bai_4_BorderLayout() {
		setTitle("Border Layout");
		setVisible(true);
		setSize(450, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground((Color.RED));
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		JButton btnN = new JButton("NOUTH");
		pnNorth.add(btnN);
		
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.RED);
		pnBorder.add(pnSouth , BorderLayout.SOUTH);
		JButton btnS = new JButton("SOUTH");
		pnSouth.add(btnS);
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnBorder.add(pnWest , BorderLayout.WEST);
		JButton btnW = new JButton("WEST");
		pnWest.add(btnW);
		
		JPanel pnEest = new JPanel();
		pnEest.setBackground(Color.BLUE);
		pnBorder.add(pnEest , BorderLayout.EAST);
		JButton btnE = new JButton("EAST");
		pnEest.add(btnE);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		pnBorder.add(pnCenter , BorderLayout.CENTER);
		JButton btnC = new JButton("Center");
		pnCenter.add(btnC);
		
		getContentPane().add(pnBorder);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai_4_BorderLayout Bor = new Bai_4_BorderLayout();
	}

}
