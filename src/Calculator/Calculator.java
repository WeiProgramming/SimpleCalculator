package Calculator;

public class Calculator {
	Double a,b;
	String eq;
	
	public Calculator(Double a, Double b, String eq){
		this.a = a;
		this.b = b;
		this.eq = eq;
	}
	public Double add(){
		return (double) (a + b);
	}
	public Double subract(){
		return (double) (a - b);
	}
	public Double multiply(){
		return (double) (a * b);
	}
	public Double divide(){
		return (double) (a/b);
	}
	public Double remainder(){
		return (double) (a%b);
	}
}