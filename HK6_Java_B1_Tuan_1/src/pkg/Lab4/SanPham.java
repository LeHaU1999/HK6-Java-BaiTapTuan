package pkg.Lab4;

import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	private double ThueNhapKhau;
	
	public  SanPham() {
		
	}
	
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	public double getThueNhapKhau() {
		return ThueNhapKhau;
	}
	public void setThueNhapKhau(double thueNhapKhau) {
		ThueNhapKhau = thueNhapKhau;
	}


	static Scanner sc = new Scanner(System.in);
	
	public SanPham(String tenSP, double donGia, double giamGia){ 
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSp, double donGia){
		this(tenSp, donGia,0);
	}


	public void nhapThongTinSanPham( Scanner sc) {
		System.out.println("Nhập tên SP");
		tenSP = sc.nextLine();
		System.out.println("Nhập Đơn Giá");
		donGia = Double.parseDouble(sc.nextLine());
		System.out.println("Giảm Giá");
		giamGia = Double.parseDouble(sc.nextLine());
		
	}
	public void xuatThongTinSanPham() {
		System.out.println("Thông Tin SP ");
		System.out.println("Tên SP:" + tenSP);
		System.out.println("Đơnn Giá" + donGia);
		System.out.println("Giảm Giá:" + giamGia);
		System.out.println("Thuế SP" + (donGia * 10)/100);
		System.out.println("  ");
		
	}
	

}

