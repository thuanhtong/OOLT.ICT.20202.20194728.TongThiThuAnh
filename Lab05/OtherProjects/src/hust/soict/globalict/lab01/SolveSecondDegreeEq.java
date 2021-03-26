package hust.soict.globalict.lab01;

import java.util.Scanner;

public class SolveSecondDegreeEq {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Solve the equation a^2x + bx + c = 0");
			System.out.print("Enter a: ");
			double a=sc.nextDouble();
			System.out.print("Enter b: ");
			double b=sc.nextDouble();
			System.out.print("Enter c: ");
			double c=sc.nextDouble();
			if(a==0){
			    if(b==0){
			      if(c==0) System.out.println("The equation has infinite solution.");
			      else System.out.println("The equation has no solution.");
			    }
			    else System.out.println("The equation has a solution: x= " + (-c/b));
			}
			else{
			    double d=b*b - 4*a*c;
			    if(d<0) System.out.println("The equation has no solution.");
			    else if(d==0) System.out.println("The equation has a solution: x= " + (-b/2*a));
			    else System.out.println("The equation has two solutions: x1= " + ((-b+d)/2*a) + "; x2= " +
			    ((-b-d)/2*a));
			}
		}
        
    }
}
