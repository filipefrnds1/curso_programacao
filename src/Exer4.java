import java.util.Locale;
import java.util.Scanner;

import packest.Student;

public class Exer4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		String name;
		double n1,n2,n3;
		
		
		System.out.print("Nome do Aluno: ");
			name = sc.nextLine();
			stud.setName(name);
		
		System.out.print("Nota 1 do aluno: ");
			n1 = sc.nextDouble();
			stud.setNota1(n1);
			
		System.out.print("Nota 2 do aluno: ");	
			n2 = sc.nextDouble();
			stud.setNota2(n2);
			
		System.out.print("Nota 3 do aluno: ");
		  	n3 = sc.nextDouble();
		  	stud.setNota3(n3);
		  	
		System.out.printf("FINAL GRADE = %.2f%n", stud.gradeFinal());   	
		System.out.println(stud.resultFinal());
		  	
		/*nf = stud.getNota1()+stud.getNota2()+stud.getNota3();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", nf));
		
		if(nf >= 60) {
			   System.out.println("PASS");
		   }else {
			   System.out.println("FAILED");
			   System.out.println("MISSING " + String.format("%.2f", 60-nf) + " POINTS");
		   }*/		
	
		
		sc.close();
	}

}
