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
		System.out.println("The answer is: "+ solution);
		return solution;
	}
	public Double subract(Double a, Double b){
		solution = (double) (a - b);
		System.out.println("The answer is: "+ solution);
		return solution;
	}
	public Double multiply(Double a, Double b){
		solution = (double) (a * b);
		System.out.println("The answer is: "+ solution);
		return solution;
	}
	public Double divide(Double a, Double b){
		solution = (double) (a/b);
		System.out.println("The answer is: "+ solution);
		return solution;
	}
	public Double remainder(Double a, Double b){
		solution = (double) (a%b);
		System.out.println("The answer is: "+ solution);
		return solution;
	}
//	public void solution(Double a, Double b,String operand){
//		String eq = operand;
//		if(eq == add){
//			add(a, b);
//		}
//		else if(operand == sub){
//			subract(a, b);
//		}
//		else if(operand == mult){
//			multiply(a, b);
//		}
//		else if (operand == div){
//			divide(a, b);
//		}
//		else if (operand == mod){
//			remainder(a, b);
//		}
//		else{
//			System.out.println("Invalid");
//		}
//	}
}
