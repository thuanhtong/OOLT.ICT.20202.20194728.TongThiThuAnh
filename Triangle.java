import java.util.Scanner;
public class Triangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle: ");
		int n = sc.nextInt();
		int i,j;
		for(i=1; i<=n; i++){
			for(j= n-i; j> 0; j--){
				System.out.print(" ");
			}
			for(j= 1; j<= i; j++){
				System.out.print("*");
			}
			for(j= 2; j<= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}