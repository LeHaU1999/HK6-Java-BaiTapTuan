package pkg.Lab3;

import java.util.Scanner;

public class Lab3_Bai2 {
	public static void BangCuuChuong() {
		int ketQua = 0, i, j = 0;
		for (i = 1; i < 10; i++) {
			System.out.println("Bang Cuu Chuong " + i);
			for (j = 1; j <= 10; j++) {
				ketQua = i * j;
				System.out.println(i + " x " + j + " = " + ketQua);
			}
		}
	}
}
