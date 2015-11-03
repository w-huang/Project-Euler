import java.util.*;
import helpers.month;


public class q19 {
	public static void main(String[] args) {
		int daysPerMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int result = 0;
		int numDays = 365 * 100;
		int currMonth = 0;
		int currDay = 1;
		int currYear = 1901;
		while(numDays > 0){
			int d = daysPerMonth[currMonth];
			if(currMonth == 1 && isLeapYear(currYear) > 0){
				d++;
				numDays++;
			}
			currDay = (currDay + (d % 7)) % 7;
			
			numDays = numDays - daysPerMonth[currMonth];
			++currMonth;
			if(currDay == 6)
				++result;
			if(currMonth > 11){
				currMonth = 0;
				++currYear;
			}
				
		}
		
		System.out.println(result);
	}
	
	public static int isLeapYear(int year){
		if(year%400 == 0){
			return 1;
		}
		if(year%100 == 0){
			return 0;
		}
		if(year%4 == 0){
			return 1;
		}else{
			return 0;
		}
	}

}
