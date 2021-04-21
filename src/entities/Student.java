package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	private double finalGrade;
	
	public double finalGrade() {
		return finalGrade = grade1 + grade2 + grade3;
	}

	@Override
	public String toString() {
		String result1 = "Student [name=" + name + 
				", grade1=" + grade1 + 
				", grade2=" + grade2 + 
				", grade3=" + grade3 + "]" +
				"\n" +
				"FINAL GRADE= " + finalGrade() +
				"\n";
		String result2;
		if (finalGrade > 59) {
			result2 = "Pass";
		} else {
			result2 = "Failed";
		}
		return result1 + result2;
	}
	
}
