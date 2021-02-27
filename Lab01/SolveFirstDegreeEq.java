import java.util.Scanner;

public class SolveFirstDegreeEq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Solve the equation ax + b = 0");
        System.out.print("Enter a: ");
        double a=sc.nextDouble();
        System.out.print("Enter b: ");
        double b=sc.nextDouble();
        if(a==0){
            if(b==0) System.out.println("The equation has infinite solution.");
            else System.out.println("The equation has no solution.");
        }
        else System.out.println("The equation has a solution: x=" + (-b/a));
    }
}
