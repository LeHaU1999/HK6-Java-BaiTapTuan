package pkg.Lab1;
import java.util.Scanner;

public class Lab1_Bai1 {
	public static void ThongTinHS () {
		Scanner sc = new Scanner(System.in);
		String hoTen;
		float diemTB;
		
		System.out.print("Nhập Tên Học Sinh: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập ĐTB: ");
		diemTB = Float.parseFloat(sc.nextLine());
		
		System.out.println("Tên: "+hoTen + " , "+"ĐTB: " + diemTB);
	}
}
