import java.util.Locale;
import java.util.Scanner;

import packest.Calculate;

public class Programcircun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Calculate calc = new Calculate();
		
		System.out.println("Enteder radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
			
		
		sc.close();

	}

}
