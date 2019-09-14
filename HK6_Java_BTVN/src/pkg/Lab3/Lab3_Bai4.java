package pkg.Lab3;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Lab3_Bai4 {
	
	public static void MangHocSinh() {
		Scanner  sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào n ");
		n=  Integer.parseInt(sc.nextLine());
		Lab3_Bai4_classSinhVien[] list = new Lab3_Bai4_classSinhVien[n];
		for(int i = 0 ; i< n ; i++) {
			System.out.println("Nhập Vào SV thứ "+(i+1));
			list[i] = new Lab3_Bai4_classSinhVien();
			list[i].NhapThongtinHS();
		}
		for(int i = 0; i< n ;i++) {
			list[i].XuatThongTinHS();
			list[i].XuLiDiem();
		}
	}
	
}
