package pkg.Lab4;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Số Lượng SP: ");
		int n = sc.nextInt();
		ArrayList<SanPham> list = new ArrayList<SanPham>(n);
		for (int i = 0; i < n; i++) {
			SanPham sp = new SanPham();
			sp.nhapThongTinSanPham(sc);
			list.add(sp);
		}
		for (int j = 0; j < n; j++) {
			list.get(j).xuatThongTinSanPham();

		}

	}

}
