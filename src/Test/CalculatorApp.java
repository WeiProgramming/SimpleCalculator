package Test;
import java.util.Scanner;

import Calculator.*;

public class CalculatorApp{
	private static Double solution;
	
	public static void main(String[] args){
		System.out.println("Welcome To Simple Calculator\n");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter First Number");
		Double firstNum = scanner.nextDouble();
		
		System.out.println("Please Enter Operand");
		String operand = scanner.next();
		operand.toString();
		
		System.out.println("Please Enter Second Number");
		Double secondNum = scanner.nextDouble();
		scanner.close();

		Calculator calculator = new Calculator();
		calculator.solution(firstNum,secondNum,operand);
		
//		System.out.println("first"+firstNum+"second"+secondNum+"operand"+operand+"sol"+solution);
	}
}