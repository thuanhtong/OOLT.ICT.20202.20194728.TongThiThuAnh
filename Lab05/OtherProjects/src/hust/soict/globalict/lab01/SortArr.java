package hust.soict.globalict.lab01;

import java.util.Scanner;

public class SortArr {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter number of element of the array: ");
		  int n = sc.nextInt();
		  int a[] = new int[n];
		  for(int i= 0; i< n; i++){
		      System.out.printf("a[%d]= ", i);
		      a[i]= sc.nextInt();
		  }

		  int temp= a[0];
		  for (int i= 0 ; i< n-1; i++) {
		      for (int j= i+1; j< n; j++) {
		          if (a[i] > a[j]) {
		              temp = a[j];
		              a[j] = a[i];
		              a[i] = temp;
		          }
		      }
		  }
		  System.out.print("Result: ");
		  for (int i= 0; i< n; i++) {
		        System.out.print(a[i] + " ");
		  }
	}
    
  }
}
