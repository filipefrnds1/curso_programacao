import java.util.Locale;
import java.util.Scanner;

import packest.Rectangle;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.println("AREA = " + rec.area());
		System.out.println("PERIMETER = " + rec.perimeter());
		System.out.println("DIAGONAL = " + rec.diagonal());
		
		
		
		
		
		sc.close();
	}

}
