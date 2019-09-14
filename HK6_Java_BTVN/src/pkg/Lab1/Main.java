package pkg.Lab1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Menu");
			System.out.println("0 - Thoat");
			System.out.println("1 - Bai 1");
			System.out.println("2 - Bai 2");
			System.out.println("3 - Bai 3");
			System.out.println("4 - Bai 4");
			System.out.println("Mời Bạn Chọn: ");
			
			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 0: break;
			case 1: {
					Lab1_Bai1.ThongTinHS();
				break;
			}
			case 2: {
					Lab1_Bai2.HinhChuNhat();
				break;
			}
			case 3:{
				Lab1_Bai3.KhoiLapPhuong();
				break;
			}
			case 4:{
				Lab1_Bai4.PhuongTrinhBacHai();
				break;
			}
			default:
				break;
			}
			sc.nextLine();
		}while(true);
	}
}
