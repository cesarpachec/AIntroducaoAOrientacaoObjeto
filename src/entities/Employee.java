package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary (double percentage) {
		double increasePercent = percentage / 100;
		grossSalary = grossSalary + (grossSalary * increasePercent);
	}

	@Override
	public String toString() {
		return "[name=" + name + ", $" + String.format("%.2f", (grossSalary - tax)) + "]";
	}
	
	
}
