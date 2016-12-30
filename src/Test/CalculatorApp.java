package Test;
import java.util.Scanner;

import Calculator.*;

public class CalculatorApp{
	
	public static void main(String[] args){
		System.out.println("Welcome To Simple Calculator\n");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter First Number");
		Double firstNum = scanner.nextDouble();
		
		System.out.println("Please Enter Operand");
		String operand = scanner.next();
		
		System.out.println("Please Enter Second Number");
		Double secondNum = scanner.nextDouble();

		Calculator calculator = new Calculator(firstNum, secondNum, operand);
		
		if(operand == "+"){
//			calculator.add();
			System.out.println("Your answer is " + calculator.add());
		}
		else if(operand == "-"){
			calculator.subract();
		}
		else if(operand == "*"){
			calculator.multiply();
		}
		else if (operand == "/"){
			calculator.divide();
		}
		else if (operand == "%"){
			calculator.remainder();
		}
	}
}