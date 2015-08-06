import java.util.Scanner;
import static java.lang.System.out;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		int operationCode = 0;
		
		out.print("What is the the first number? : ");
		num1 = sc.nextDouble();
		out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Modulus");
		out.print("What do you want to do? : ");
		operationCode = sc.nextInt();
		
		boolean isValid = false;
		while (!isValid) {
			if (operationCode > 0 && operationCode < 6) {
				isValid = true;
				out.print("What is the second number ? : ");
				num2 = sc.nextDouble();
				out.println();
				out.print(num1 + " " + printOperation(operationCode) + " " + num2 + " = " + calculate(num1, num2, operationCode));
			} else {
				out.print("Invalid input. Please enter again. ");
				operationCode = sc.nextInt();
			}
		}
		
	}
	
	public static String printOperation(int operationCode) {
		switch(operationCode) {
		case 1:
			return "+";
		case 2:
			return "-";
		case 3:
			return "*";
		case 4:
			return "/";
		default:
			return "%";
		}
	}
	
	public static double calculate(double num1, double num2, int operationCode) {
		switch(operationCode) {
		case 1:
			return addition(num1, num2);
		case 2:
			return subtraction(num1, num2);
		case 3:
			return multiplication(num1, num2);
		case 4:
			return division(num1, num2);
		default:
			return modulus(num1, num2);
		}
	}
	
	public static double addition(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double modulus(double num1, double num2) {
		return num1 % num2;
	}
	
}
