package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Bai_5_Control extends JFrame{
	
	public Bai_5_Control() {
		setTitle("Giai Phuong Trinh Bac 2");
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Font
		Font font = new Font("Book Antiqua" , Font.BOLD | Font.ITALIC, 35) ;  
		Font font1 = new Font("Book Antiqua" , Font.BOLD | Font.ITALIC, 20) ;
		Font font2 = new Font("Time New Roman" , Font.BOLD | Font.ITALIC, 22) ;
		
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		
		// pannel top
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.GRAY);
		pnBorder.add(pnNorth , BorderLayout.NORTH);
		
		JLabel lbText  = new JLabel("Giai Phuong Trinh Bac 2");
		lbText.setFont(font);
		pnNorth.add(lbText);
		// ket thuc pannel top
		
		
		// pannel Center
		JPanel pnCenter =new JPanel();
		pnCenter.setBackground(Color.LIGHT_GRAY);
		pnBorder.add(pnCenter, BorderLayout.CENTER);

			// tạo border cho pnCenter
		Border bor = BorderFactory.createLineBorder(Color.red);
		TitledBorder titBor = new TitledBorder(bor , "Nhap a, b, c");
		titBor.setTitleFont(font1);
		pnCenter.setBorder(titBor);
		
			//Bươc 1: Tạo BoxLayout theo kiểu Y_AXIS
			//Bước 2: Tạo FlowLayout cho mỗi Lable và TextField
			//Bước 3: Tạo lable vsf TextField
			//Bước 4: add lable và textfiel vào Flowlayout	
			//Bước 5: add các FlowLayout vào BoxLayout
			//Bước 6: add BoxLayout vào pnCenter
		
		//B1
		JPanel pnBox = new JPanel();						
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		pnBox.setBackground(Color.LIGHT_GRAY);
		
		//B2
		JPanel pnFlow1 = new JPanel();						
		pnFlow1.setLayout(new FlowLayout());
		pnFlow1.setBackground(Color.LIGHT_GRAY);
		//B3
		JLabel lblA = new JLabel("a:");
		lblA.setFont(font1);
		JTextField txtSoA = new JTextField(15);
		txtSoA.setFont(font1);
		//B4
		pnFlow1.add(lblA);
		pnFlow1.add(txtSoA);
		//B5
		pnBox.add(pnFlow1);
		
		//B2
		JPanel pnFlow2 = new JPanel();						
		pnFlow2.setLayout(new FlowLayout());
		pnFlow2.setBackground(Color.LIGHT_GRAY);
		//B3
		JLabel lblB = new JLabel("b:");
		lblB.setFont(font1);
		JTextField txtSoB = new JTextField(15);
		txtSoB.setFont(font1);
		//B4
		pnFlow2.add(lblB);
		pnFlow2.add(txtSoB);
		//B5
		pnBox.add(pnFlow2);
		
		//B2
		JPanel pnFlow3 = new JPanel();						
		pnFlow3.setLayout(new FlowLayout());
		pnFlow3.setBackground(Color.LIGHT_GRAY);
		//B3
		JLabel lblC = new JLabel("c:");
		lblC.setFont(font1);
		JTextField txtSoC = new JTextField(15);
		txtSoC.setFont(font1);
		//B4
		pnFlow3.add(lblC);
		pnFlow3.add(txtSoC);
		//B5
		pnBox.add(pnFlow3);
		
		
		
		JLabel lblKQ = new JLabel("Kết Quả");
		lblKQ.setFont(font2);
		JTextArea txtKQ = new JTextArea(2 , 15);
		//txtKQ.setBackground(Color.LIGHT_GRAY);
		txtKQ.setEditable(false);
		pnBox.add(lblKQ);
		pnBox.add(txtKQ);
		
		//B6
		pnCenter.add(pnBox);
		// ket thuc pannel Center
		
		
		// panner bottom
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.LIGHT_GRAY);
		pnBorder.add(pnSouth , BorderLayout.SOUTH);
		
		Border bor1 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		TitledBorder titBor1 = new TitledBorder(bor , "Chọn Thao Tác");
		titBor1.setTitleFont(font1);
		pnSouth.setBorder(titBor1);
		
		JButton btn1 = new JButton("Giải");
		btn1.setFont(font2);
		JButton btn2 = new JButton("Xóa Trắng");
		btn2.setFont(font2);
		JButton btn3 = new JButton("Thoát");
		btn3.setFont(font2);
		
		pnSouth.add(btn1);
		pnSouth.add(btn2);
		pnSouth.add(btn3);
		// ket thuc pannel Botton
		
		add(pnBorder);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai_5_Control control = new Bai_5_Control();
	}

}
