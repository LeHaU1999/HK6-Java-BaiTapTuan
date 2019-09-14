package pkg.Lab3;

import java.util.Scanner;

public class Lab3_Bai1 {
	public static void SoNguyenTo() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhập Vào Số nguyên n :");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 2 ; i <= n/2 ; i++) {
			if( n % i == 0) {
				count ++;
			}
		}
		if(count > 0) {
			System.out.println("Không Phải Là Số Nguyên Tố...");
		}
		else {
			System.out.println("Là Số Nguyên Tố......");
		}	
	}

}
