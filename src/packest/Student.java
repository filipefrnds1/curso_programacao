package packest;

public class Student {
	
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return this.nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getNota3() {
		return nota3;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double gradeFinal() {
		return this.nota1+this.nota2+this.nota3;
	}
	
	public String resultFinal() {
		//double last = gradeFinal();
		if(gradeFinal() >= 60) {
			return "PASS";
		}else {
			return "MISSING " + String.format("%.2f",(60 - gradeFinal())) + " POINTS";
		}
		
	}
	
	
}
