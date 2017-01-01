package Test;
import java.util.Scanner;

import Calculator.*;

public class CalculatorApp{
	private static Double solution;
	private static String add = "+";
	private static String sub = "-";
	private static String mult = "*";
	private static String mod = "%";
	private static String div = "/";
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		System.out.println("Welcome To Simple Calculator\n");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter First Number");
		Double firstNum = scanner.nextDouble();
		
		System.out.println("Please Enter Operand");
		String operand = scanner.next();
		
		System.out.println("Please Enter Second Number");
		Double secondNum = scanner.nextDouble();
		scanner.close();

//		solution = calculator.add(firstNum, secondNum);
		
		if(operand == add){
			calculator.add(firstNum, secondNum);
		}
		else if(operand == sub){
			calculator.subract(firstNum, secondNum);
		}
		else if(operand == mult){
			calculator.multiply(firstNum, secondNum);
		}
		else if (operand == div){
			calculator.divide(firstNum, secondNum);
		}
		else if (operand == mod){
			calculator.remainder(firstNum, secondNum);
		}
		else{
			System.out.println("Invalid Please Re-Enter");
		}
	}
}