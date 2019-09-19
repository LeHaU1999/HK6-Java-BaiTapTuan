package pkg.Lab2;

import java.util.Scanner;

public class Lab2_Bai1 {
	public static void PhuongTrinhBacNhat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		float a = sc.nextFloat();
		System.out.print("Nhập hệ số b: ");
		float b = sc.nextFloat();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vô số nghiệm");
			} else {
				System.out.println("PT vô nghiêm");
			}
		} else {
			System.out.println("x = " + -b / a);
		}
	}
}
