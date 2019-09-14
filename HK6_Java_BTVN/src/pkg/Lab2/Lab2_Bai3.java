package pkg.Lab2;

import java.util.Scanner;

public class Lab2_Bai3 {
	public static void TienDien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Vào Số Điện Sử Dụng: ");
		int dienSuDung = sc.nextInt();
		float tienDien = 0;
		if(dienSuDung <= 50) {
			tienDien = dienSuDung * 1000;
		}
		else {
			tienDien = dienSuDung * 1200;
		}
		
		System.out.println("Tổng tiên: "+tienDien);
	}
}
