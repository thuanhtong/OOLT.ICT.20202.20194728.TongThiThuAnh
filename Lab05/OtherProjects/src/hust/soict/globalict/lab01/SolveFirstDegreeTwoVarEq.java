package hust.soict.globalict.lab01;

import java.util.Scanner;

public class SolveFirstDegreeTwoVarEq {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Solve the first-degree equation with two variables: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2");

			System.out.print("Enter a11: ");
			double a11=sc.nextDouble();
			System.out.print("Enter a12: ");
			double a12=sc.nextDouble();
			System.out.print("Enter b1: ");
			double b1=sc.nextDouble();

			System.out.print("Enter a21: ");
			double a21=sc.nextDouble();
			System.out.print("Enter a22: ");
			double a22=sc.nextDouble();
			System.out.print("Enter b2: ");
			double b2=sc.nextDouble();
			double d, d1, d2;
			d= a11*a22 - a21*a12;
			d1= b1*a22 - b2*a12;
			d2= a11*b2 - a21*b1;
			
			if(d==0){
			    if(d1==0 && d2==0) System.out.println("The equation has infinite solution.");
			    else System.out.println("The equation has no solution.");
			}
			else System.out.println("The equation has a solution: x1= " + (d1/d) + "; x2= " + (d2/d));
		}
    }
}

