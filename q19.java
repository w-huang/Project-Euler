import java.util.*;
import helpers.month;


public class q19 {
	
	public static Hashtable<month, Integer> sundaysPerYear;

	public static void main(String[] args) {
		/*
		sundaysPerYear = new Hashtable<month, Integer>();
		
		sundaysPerYear.put(new month(1,false), 0);
		sundaysPerYear.put(new month(2,false), 0);
		sundaysPerYear.put(new month(3,false), 0);
		sundaysPerYear.put(new month(4,false), 0);
		sundaysPerYear.put(new month(5,false), 0);
		sundaysPerYear.put(new month(6,false), 0);
		sundaysPerYear.put(new month(7,false), 0);
		sundaysPerYear.put(new month(8,false), 0);
		sundaysPerYear.put(new month(9,false), 0);
		sundaysPerYear.put(new month(10,false), 0);
		sundaysPerYear.put(new month(11,false), 0);
		sundaysPerYear.put(new month(12,false), 0);

		sundaysPerYear.put(new month(1,true), 0);
		sundaysPerYear.put(new month(2,true), 0);
		sundaysPerYear.put(new month(3,true), 0);
		sundaysPerYear.put(new month(4,true), 0);
		sundaysPerYear.put(new month(5,true), 0);
		sundaysPerYear.put(new month(6,true), 0);
		sundaysPerYear.put(new month(7,true), 0);
		sundaysPerYear.put(new month(8,true), 0);
		sundaysPerYear.put(new month(9,true), 0);
		sundaysPerYear.put(new month(10,true), 0);
		sundaysPerYear.put(new month(11,true), 0);
		sundaysPerYear.put(new month(12,true), 0);
		
		
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1901; i<2001; ++i){
			if(isLeapYear(i) == 1)
				++count;
			if(count == 1){
				System.out.println(i);
			}
		}
		System.out.println(count);*/
		
		int[] result = new int[7];
		for(int i = 0; i < 7; i++){
			result[i] = 0;
		}
		int[] days = new int[12];
		days[0] = 31;
		days[1] = 28;
		days[2] = 31;
		days[3] = 30;
		days[4] = 31;
		days[5] = 30;
		days[6] = 31;
		days[7] = 31;
		days[8] = 30;
		days[9] = 31;
		days[10] = 30;
		days[11] = 31;
		
		int currentDay = 1;
		
		for(int i = 0; i < 12; ++i){
			result[currentDay - 1] += 1;
			currentDay += days[i]%7 - 1;
			
		}
		
		
		
		
		
		
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
