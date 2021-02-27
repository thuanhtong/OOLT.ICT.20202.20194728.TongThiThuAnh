import java.util.Scanner;

public class 6-6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of 2 matrices (n*m): ");
        System.out.print("Enter number of line (n): ");
        int n= sc.nextInt();
        System.out.print("Enter number of row (m): ");
        int m= sc.nextInt();

        int [][] a1= new int[n][m];
        int [][] a2= new int[n][m];

        System.out.println("Enter the first matrices (integer element): ");
        for (int i= 0; i< n; i++) {
			      for (int j= 0; j< m; j++) {
				      a1[i][j] = sc.nextInt();
			      }
		    }

        System.out.println("Enter the second matrices (integer element): ");
        for (int i= 0; i< n; i++) {
			      for (int j= 0; j< m; j++) {
				      a2[i][j] = sc.nextInt();
			      }
		    }

        System.out.println("Sum of two matrices: ");
        for (int i= 0; i< n; i++) {
			      for (int j= 0; j< m; j++) {
				      System.out.print(a1[i][j] + a2[i][j] + " ");
			      }
            System.out.println();
		    }

    }
}
