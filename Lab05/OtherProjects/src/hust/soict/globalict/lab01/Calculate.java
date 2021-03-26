package hust.soict.globalict.lab01;

import java.util.Scanner;
public class Calculate{
	public static void main(String args[]){
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Enter the first number: ");
			double num1 = keyboard.nextDouble();
			System.out.println("Enter the second nuber: ");
			double num2 = keyboard.nextDouble();
			double sum= num1+num2;
			double diff=num1-num2;
			double pro=num1*num2;
			System.out.println("Sum: " + sum);
			System.out.println("Different: " + diff);
			System.out.println("Product: " + pro);
			if(num2!=0){
				double quo=num1/num2;
				System.out.println("Quotient: " + quo);
			}
			else System.out.println("Not existing quotient (divisor=0)");
		}
	}
}

