package helpers;
import java.util.*;

public class helpers {
	
	
	public static ArrayList<int[]> primeFactors(long number){
		//return an array of integer pairs (x,y); x is the prime factor, y is the number of times x occurs.
		long limit = (long) Math.sqrt(number);
		ArrayList<int[]> factors = new ArrayList<int[]>();
		//start iterating through the factors
		for(long i = 2; i < limit; ++i){
			int count = 0;
			if(isPrime(i) && number % i == 0){
				while(number % i == 0){
					number /= i;
					count++;
				}
				int[] primeFactor = new int[2];
				primeFactor[0] = (int) i;
				primeFactor[1] = count;
				factors.add(primeFactor);
			}
		}
		
		return factors;
		
	}
	public static void printArray(int[] a){
		System.out.println("The values of a are: ");
		for(int i = 0; i < a.length; ++i){
			System.out.print(" " + a[i]);
		}
	}
	
	public static String arrayToString(int[] a){
		StringBuffer s = new StringBuffer();
		for(int i = 0; i < a.length; ++i){
			s.append(" ");
			s.append(a[i]);
		}
		return s.toString();
	}
	
	public static int numDigits(int i){
		int a = 0;
		while(i > 0){
			++a;
			i /= 10;
		}
		return a;
	}
	
	public static boolean isPrime(long number){
		if(number == 1) return false;
		if(number == 2){
			return true;
		}
		if(number%2 == 0){
			return false;	
		}
		for(int i = 3; i<=Math.sqrt(number); ++i){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static LinkedList<Integer> arrayAdd(LinkedList<Integer> x1, LinkedList<Integer> y1){
		LinkedList<Integer> result = new LinkedList<Integer>();
		LinkedList<Integer> longer;
		LinkedList<Integer> shorter;
		if(x1.size() >= y1.size()){
			 longer = x1;
			 shorter = y1;
		}else{
			longer = y1;
			shorter = x1;
		
		}
		int carry = 0;
		int value = 0;
		for(int i = 1; i < shorter.size() + 1; ++i){
			value = shorter.get(shorter.size() - i) + longer.get(longer.size() - i) + carry;
			carry = 0;
			if (value >= 10){
				value -= 10;
				carry = 1;
			}
			result.add(0, value);
		}
		
		for(int i = shorter.size() + 1; i < longer.size() + 1; ++i){
			value = longer.get(longer.size() - i) + carry;
			carry = 0;
			if(value >= 10){
				value -= 10;
				carry = 1;
			}
			result.add(0, value);
		}
		if(carry != 0)
			result.add(0,1);
		
		return result;
	}
	
	public static long arrayToLong(LinkedList<Integer> x){
		long output = 0;
		for(int i = 0; i < x.size(); ++i){
			output *= 10;
			output += x.get(i);
		}
		return output;
	}
}