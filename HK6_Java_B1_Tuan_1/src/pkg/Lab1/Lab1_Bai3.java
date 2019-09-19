package pkg.Lab1;
import java.util.Scanner;

public class Lab1_Bai3 {
	public static void KhoiLapPhuong() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập vào cạnh cua hình lập phương: ");
		float canh = sc.nextFloat();
		float theTich = canh*canh*canh;
		System.out.println("Thể Tích: "+theTich);
	}
}
