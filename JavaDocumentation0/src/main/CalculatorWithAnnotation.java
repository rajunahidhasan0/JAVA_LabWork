package main;
import java.util.Scanner;
/**
 * <h1>Calculator</h1>
 * This programmes work as a general calculator.
 * It has 4 general operation.such as,
 * (1)Addition
 * (2)Subtraction
 * (3)Multiplication
 * (4)Division
 * <p>
 * <b>Note:</b>
 * This program is user friendly.
 * 
 * @author Nahid Hasan
 * @version 1.1
 * @since 29-10-2018
 */
public class CalculatorWithAnnotation {
	
	/**
	 * This method return a double value by add num1 and num2.
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	public static double add(double num1, double num2) {
		return num1+num2;
	}
	/**
	 * This method return a double value by subtract num2 to num1.
	 * @param num1
	 * @param num2
	 * @return num1-num2
	 */
	public static double sub(double num1, double num2) {
		return num1-num2;
	}
	/**
	 * This method return a double value by multiply num1 and num2.
	 * @param num1
	 * @param num2
	 * @return num1*num2
	 */
	public static double mul(double num1, double num2) {
		return num1*num2;
	}
	/**
	 * This method return a double value by divide num2 to num1.
	 * @param num1
	 * @param num2
	 * @return num1/num2
	 */
	public static double div(double num1, double num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		String ch;
	
		Scanner inp=new Scanner(System.in);
		while(true) {
			System.out.println("Each time Enter two numbers: ");
			a=inp.nextDouble(); 
			b=inp.nextDouble();
			System.out.println("Operation? ( '+', '-','*', '/' ) : ");
			ch=inp.next();
			if(ch.compareTo("+")==0) {
				System.out.println(add(a, b));
			}
			else if(ch.compareTo("-")==0) {
				System.out.println(sub(a, b));
			}
			else if(ch.compareTo("*")==0) {
				System.out.println(mul(a, b));
			}
			else {
				System.out.println(div(a, b));
			}
		}
	}

}
