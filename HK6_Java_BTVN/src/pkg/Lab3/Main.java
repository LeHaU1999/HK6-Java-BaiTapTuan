package pkg.Lab3;

import java.util.Scanner;
public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu Lab-3");
			System.out.println("0 - Thoat");
			System.out.println("1 - Bai 1: Số Nguyên Tố");
			System.out.println("2 - Bai 2: Bảng Cửu Chương");
			System.out.println("3 - Bai 3: Mảng Số Nguyên");
			System.out.println("4 - Bai 4:Mảng Học Sinh");
			System.out.println("Mời Bạn Chọn: ");
			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 0: break;
			case 1: {
				Lab3_Bai1.SoNguyenTo();
				break;
			}
			case 2: {
				Lab3_Bai2.BangCuuChuong();
				break;
			}
			case 3:{
				Lab3_Bai3.MangSoNguyen();
				break;
			}
			case 4:{
				Lab3_Bai4.MangHocSinh();
				break;
			}
			default:
				break;
			}
			sc.nextLine();
		}while(true);
	}
}
