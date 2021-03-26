package hust.soict.globalict.lab01;

import java.util.Scanner;

public class Numday{
  public static void main(String[] strings) {
      try (Scanner sc = new Scanner(System.in)) {
		int n=0;
		  do{
		      System.out.print("Enter a month: ");
		      String month = sc.nextLine();

		      System.out.print("Enter the year of the month: ");
		      int year = sc.nextInt();
		      sc.nextLine();

		      //January
		      if(month.equals("Jan.") || month.equals("Jan") || month.equals("January") || month.equals("1")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }
		      //Febbruary
		      else if(month.equals("Feb.") || month.equals("February") || month.equals("Feb") || month.equals("2")){
		          if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		              System.out.print("Number of day in the month: 29");
		          else System.out.print("Number of day in the month: 28");
		          n=0;
		      }
		      //March
		      else if(month.equals("Mar.") || month.equals("Mar") || month.equals("March") || month.equals("3")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }
		      //April
		      else if(month.equals("Apr.") || month.equals("Apr") || month.equals("April") || month.equals("4")){
		          System.out.print("Number of day in the month: 30");
		          n=0;
		      }
		      //May
		      else if(month.equals("May") || month.equals("5")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }
		      //June
		      else if(month.equals("June") || month.equals("Jun") || month.equals("6")){
		          System.out.print("Number of day in the month: 30");
		          n=0;
		      }
		      //July
		      else if(month.equals("July") || month.equals("Jul")  || month.equals("7")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }
		      //August
		      else if(month.equals("Aug.") || month.equals("Aug") || month.equals("August") || month.equals("8")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }
		      //September
		      else if(month.equals("Sept.") || month.equals("Sep") || month.equals("September") || month.equals("9")){
		          System.out.print("Number of day in the month: 30");
		          n=0;
		      }
		      //October
		      else if(month.equals("Oct.") || month.equals("Oct") || month.equals("October") || month.equals("10")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }
		      //November
		      else if(month.equals("Nov.") || month.equals("Nov") || month.equals("November") || month.equals("11")){
		          System.out.print("Number of day in the month: 30");
		          n=0;
		      }
		      //December
		      else if(month.equals("Dec.") || month.equals("Dec") || month.equals("December") || month.equals("12")){
		          System.out.print("Number of day in the month: 31");
		          n=0;
		      }

		      else{
		          System.out.println("Invalid month/year. Please enter again!");
		          n=1;
		      }
		      System.out.println();
		  }while(n==1);
	}

    }
    
}
