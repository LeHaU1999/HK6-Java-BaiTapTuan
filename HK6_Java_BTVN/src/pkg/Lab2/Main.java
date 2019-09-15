package pkg.Lab2;

import java.util.Scanner;

import pkg.Lab1.Lab1_Bai4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu Lab-2");
			System.out.println("0 - Thoat");
			System.out.println("1 - Bai 1: Giải Phương Trình Bậc Nhất");
			System.out.println("2 - Bai 2: Giải Phương Trình Bậc Nhất");
			System.out.println("3 - Bai 3: Tính Tiền Diện");
			System.out.println("Mời Bạn Chọn: ");
			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 0: break;
			case 1: {
				//phuong trinh bac nhat
					Lab2_Bai1.PhuongTrinhBacNhat();
				break;
			}
			case 2: {
					Lab2_Bai2.GiaiPhuongTrinhBacHai();
				break;
			}
			case 3:{
					Lab2_Bai3.TienDien();
				break;
			}
			default:
				break;
			}
			sc.nextLine();
		}while(true);
	}

}
