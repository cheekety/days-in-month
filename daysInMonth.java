import java.util.*;

public class daysInMonth {
	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print ("Enter a month (1-12) : ");
		int month = userInput.nextInt();
		daysInMonth(month);

	}

	public static void daysInMonth (int mon){
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] months = {"0","January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("The number of days in " + months[mon] + " is " + days[mon] + ".");

	}

}