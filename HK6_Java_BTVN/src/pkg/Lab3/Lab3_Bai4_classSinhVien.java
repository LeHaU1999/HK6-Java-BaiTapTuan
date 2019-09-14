package pkg.Lab3;

import java.util.Scanner;

public class Lab3_Bai4_classSinhVien {

	private static String tenHS;
	private static float diem;

	public static void NhapThongtinHS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Tên HS: ");
		tenHS = sc.nextLine();
		System.out.println("Nhập Điểm : ");
		diem = Float.parseFloat(sc.nextLine());
		if (diem > 10 || diem < 0) {
			System.out.println("Điểm Nhập Vào Không Hợp Lệ Vui Lòng Nhập Lại");
			System.out.print("Nhập Điểm : ");
			diem = Float.parseFloat(sc.nextLine());
		}
	}

	public static void XuatThongTinHS() {
		System.out.println("==THÔNG TIN HOC SINH==");
		System.out.println("Ten HS: " + tenHS);
		System.out.println("Diem: " + diem);
		System.out.println("=======================");
		System.out.println("                       ");
	}
	
	public static void XuLiDiem() {
		if(diem > 9 ) {
			System.out.println(" --> Học Lực Xuất Sắc");
		}
		else if(diem >7.5) {
			System.out.println(" --> Học Lực Giỏi");
		}else if(diem >6.5) {
			System.out.println(" --> Học Lực Khá");
		}else if(diem >5) {
			System.out.println(" --> Học Lực TB");
		}else  {
			System.out.println(" --> Học Lực Yếu");
		}
			
	}
}
