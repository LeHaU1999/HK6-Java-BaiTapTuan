package Tuan2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class Bai_7 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai_7 window = new Bai_7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bai_7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblCacThaoTac = new JLabel("Cac Thao Tac Tren List-CheckBox");
		lblCacThaoTac.setFont(new Font("Ink Free", Font.PLAIN, 25));
		panel.add(lblCacThaoTac);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.RED);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Chon Tac Vu", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		
		
		JButton btnToDenSoChan = new JButton("To Den So Chan");
		btnToDenSoChan.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnToDenSoChan);
		
		JButton btnToDenSo_1 = new JButton("To Den So Le");
		btnToDenSo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnToDenSo_1);
		
		JButton btnToDenSo_2 = new JButton("To Den So Nguyen To");
		btnToDenSo_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnToDenSo_2);
		
		JButton btnBoToDen = new JButton("Bo To Den");
		btnBoToDen.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnBoToDen);
		
		JButton btnXoaCacGia = new JButton("Xoa cac Gia Tri Dang To Den");
		btnXoaCacGia.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnXoaCacGia);
		
		JButton btnTongGiaTri = new JButton("Tong Gia Tri Trong List");
		btnTongGiaTri.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnTongGiaTri);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JButton btnDongChuongTrinh = new JButton("DONG CHUONG TRINH");
		btnDongChuongTrinh.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_3.add(btnDongChuongTrinh);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Nhap Thong Tin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNhap = new JButton("NHAP");
		panel_2.add(btnNhap);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxChoPhepNhap = new JCheckBox("Cho Phep Nhap So am");
		panel_2.add(chckbxChoPhepNhap);
		
		JList list = new JList();
		panel_2.add(list);
	}

}
