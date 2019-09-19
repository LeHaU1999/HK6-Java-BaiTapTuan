package pkg.Lab2;

import java.util.Scanner;

import pkg.Lab1.Lab1_Bai4;

public class Lab2_Bai2 {
	public static void GiaiPhuongTrinhBacHai() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhập vào hệ số a: ");
		float a = sc.nextFloat();

		System.out.println("nhập vào hệ số b: ");
		float b = sc.nextFloat();

		System.out.println("nhập vào hệ số c: ");
		float c = sc.nextFloat();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("PT vô số nghiệm");
				} else {
					System.out.println("PT vô nghiêm");
				}
			} else {
				System.out.println("x = " + -c / b);
			}
		} else {
			float delta = b * b - 4 * a * c, x = -b / (2 * a);

			System.out.println("delta = " + delta);
			if (delta < 0) {
				System.out.println("PT vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương Trình Có Nghiệm Kép : x1 = x2 =  " + x);
			} else {
				float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("x1 = " + x1);
				float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("x2 = " + x2);
			}
		}

	}
}
