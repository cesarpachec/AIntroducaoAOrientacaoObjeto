package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	// nesse caso o método não precisa receber parâmetros porque as variáveis necessárias para o cálculo da área 
	// já estão contidos na classe.
	
	public double area() {
		double p = (a + b + c) / 2; 
		return Math.sqrt(p * (p - a ) * (p - b) * (p - c));
		
	};
	
}
