package pkg.Lab1;
import java.util.Scanner;

public class Lab1_Bai4 {
	public static void PhuongTrinhBacHai() {
		Scanner sc = new Scanner(System.in);
		//ax2+ bx + c = 0
		float a, b, c;
		
		System.out.print("nhập vào hệ số a: ");
		a= sc.nextFloat();
		System.out.print("nhập vào hệ số b: ");
		b= sc.nextFloat();
		System.out.print("nhập vào hệ số c: ");
		c= sc.nextFloat();
		
		float delta = b*b - 4*a*c , x = -b/(2*a) ;
		
		System.out.println("delta = "+delta);
		if(delta < 0) {
			System.out.println("PT vô nghiệm");
		}
		else if(delta == 0) {
			System.out.println("Phương Trình Có Nghiệm Kép : x1 = x2 =  " +x);
		}
		else {
			float x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
			System.out.println("x1 = "+ x1);
			float x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
			System.out.println("x2 = "+x2);
		}
	}
}
