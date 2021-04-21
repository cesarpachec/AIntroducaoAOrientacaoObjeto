package entities;

public class Rectangle {

	public double width;
	public double hieght;

	public double area() {
		return width * hieght; 
	};

	public double perimeter() {
		return (width + hieght) * 2;
	};
	
	public double diagonal() {
		double a = Math.pow(width, 2) + Math.pow(hieght, 2);
		return Math.sqrt(a);
	}

	@Override
	public String toString() {
		return 	"Area = " + area() + "\n"
				+ "Perimeter = " + perimeter() + "\n"
				+ "Diagonal = " + diagonal();
				
		
	}
	
	
}
