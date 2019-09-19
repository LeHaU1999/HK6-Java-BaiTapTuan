package pkg.Lab3;

import java.util.Scanner;

public class Lab3_Bai3 {
	
	public static void MangSoNguyen() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Số Phần Tử Mảng: ");
		int n = sc.nextInt();
		int [] mang = new int [n];
		NhapMang(mang,n);
		XuatMang(mang);
		SapXepMang(mang);
		PhanTuNhoNhat(mang);
		CacPhanTuChiaHetCho3(mang);
	}
	
	public static void NhapMang(int [] mang , int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< n ; i++) {
			System.out.print("Nhập Phần Tử Thứ : "+i);
			mang[i] = sc.nextInt();
		}
	}
	
	public static void XuatMang(int [] mang) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Các Phần Tử Mảng: ");
		for(int i = 0 ; i< mang.length ; i++) {
			System.out.print(mang[i]+" ");
		}
		System.out.println(" ");
	}
	
	public static void SapXepMang(int mang[]) {
		int temp = mang[0];
		for(int i = 0 ; i< mang.length ; i++) {
			for(int j = i+1 ; j < mang.length ; j++) {
				if(mang[i] > mang[j]) {
					temp = mang[j];
                    mang[j] = mang[i];
                    mang[i] = temp;
				}
			}
		}
		System.out.println("--MẢNG SAU KHI SẮP XẾP--");
		XuatMang(mang);
	}
	
	public static void PhanTuNhoNhat(int mang[]) {
		int min = mang[0];
		for(int i = 0 ; i< mang.length ; i++) {
			if(min > mang[i]) {
				min = mang[i];
			}
		}
		System.out.println("Phần Tử Nhỏ Nhất Trong Mảng :" + min);
	}
	
	public static void CacPhanTuChiaHetCho3 (int mang[]) {
		int tong =0 , count = 0;
		for(int i = 0 ; i< mang.length ; i++) {
			if(mang[i] % 3 == 0) {
				tong = tong + mang[i];
				count ++;
			}
		}
		float tbc = tong / count;
		System.out.println("TBC các số chia hết cho 3 là: "+tbc);
	}
}










