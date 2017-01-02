package Calculator;

public class Calculator {
	private Double solution;
	private String add = "+";
	private String sub = "-";
	private String mult = "*";
	private String mod = "%";
	private String div = "/";

	
	
	public Calculator(){
	}
	
	public Double add(Double a, Double b){
		solution = (double) (a + b);
		System.out.println("The added answer is: "+ solution);
		return solution;
	}
	public Double subract(Double a, Double b){
		solution = (double) (a - b);
		System.out.println("The subtracted answer is: "+ solution);
		return solution;
	}
	public Double multiply(Double a, Double b){
		solution = (double) (a * b);
		System.out.println("The multiplied answer is: "+ solution);
		return solution;
	}
	public Double divide(Double a, Double b){
		solution = (double) (a/b);
		System.out.println("The divided answer is: "+ solution);
		return solution;
	}
	public Double remainder(Double a, Double b){
		solution = (double) (a%b);
		System.out.println("The remainder answer is: "+ solution);
		return solution;
	}
	public void solution(Double a, Double b,String operand){
		if(operand.equals(add)){
			add(a, b);
		}
		else if(operand.equals(sub)){
			subract(a, b);
		}
		else if(operand.equals(mult)){
			multiply(a, b);
		}
		else if (operand.equals(div)){
			divide(a, b);
		}
		else if (operand.equals(mod)){
			remainder(a, b);
		}
		else{
			System.out.println("Invalid");
		}
	}
}
