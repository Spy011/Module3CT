package Mod3;
import java.util.Scanner;

public class GroceryAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double coupon; //coupon's value (% represented as decimal)
		
		Scanner userInput = new Scanner( System.in );
		//user input for coupon
		
		System.out.println("Please enter % off groceries as a decimal ");
		coupon = userInput.nextDouble();
		if( coupon > 0 )
				{ if( coupon <= 1 )
		{ System.out.println("Your % off as a decimal is: " + coupon);
		}
		else {
			coupon = 0.1;
			System.out.println("Your % off as a decimal is: " + coupon);
		}
				
		}
		else {
		coupon = 0.1;
		System.out.println("Your % off as a decimal is: " + coupon);
		}
		System.out.println();
		
		double week1;
		System.out.println("Please enter week 1 grocery cost");
		week1 = userInput.nextDouble();
		
		double week2;
		System.out.println("Please enter week 2 grocery cost");
		week2 = userInput.nextDouble();
		
		double week3;
		System.out.println("Please enter week 3 grocery cost");
		week3 = userInput.nextDouble();
		
		double week4;
		System.out.println("Please enter week 4 grocery cost");
		week4 = userInput.nextDouble();
		
		userInput.close(); //close Scanner	
		
		System.out.println("Your bills each week were as follows: " + week1 +"; " + week2 + "; " + week3 + "; " + week4);
		System.out.println();
		double sum = week1 + week2 + week3 + week4;
		double avg = sum/4;
		double couponMonth = sum - (sum*coupon);
		double couponAvg = avg - (avg*coupon);
		System.out.println("You spent " + sum + " on groceries this month");
		System.out.println("After coupon savings you spent " + couponMonth + " on groceries this month");
		System.out.println();
		System.out.println("You spent on average " + avg + " per week on groceries");
		System.out.println("After coupon savings you spent on average " + couponAvg + " per week on groceries");
	}
	
	{
		

}
}
