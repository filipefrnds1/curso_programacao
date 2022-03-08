import java.util.Locale;
import java.util.Scanner;

import packest.Employee;

public class Exer2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		double percent;
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp.toString());
		
		System.out.print("Which percentage to increase salary? ");
		percent = sc.nextDouble();
		
		emp.increaseSalary(percent);
		
		System.out.println(emp.toString());
		
		sc.close();
	}
}
