package pkg.Lab1;
import java.util.Scanner;

public class Lab1_Bai2 {
	public static void HinhChuNhat() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập Cạnh Thứ 1 Hình Chữ Nhật: ");
		float canha = sc.nextFloat();
		System.out.print("Nhập Cạnh Thứ 2 Hình Chữ Nhật: ");
		float canhb = sc.nextFloat();
		
		float chuVi = (canha+canhb)*2  , dienTich = canha * canhb  , canhNho = Math.min(canha, canhb), canhLon =Math.max(canha, canhb);
		
		System.out.println("Cạnh Nhỏ(Chiều Rộng): "+canhNho);	
		System.out.println("Cạnh Lớn(Chiều Dài): "+canhLon);	
		System.out.println("Chu Vi: "+chuVi);
		System.out.println("Diện Tích: " +dienTich);
	}
}
