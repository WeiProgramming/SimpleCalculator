package Test;
import java.util.Scanner;

import Calculator.*;

public class CalculatorApp{
	Float A,B;
	String Eq;
	Calculator calculator;
	
	public static void main(String[] args){
		System.out.println("Welcome To Simple Calculator Please Choose Operand");
		System.out.println("1) +");		
		System.out.println("2) -");
		System.out.println("3) *");
		System.out.println("4) /");
		System.out.println("5) %");
		Scanner scanner = new Scanner(System.in);
		String operand = scanner.nextLine();
		
		
		calculator = new Calculator(A,B,Eq);

		
	}
}