import helpers.helpers;
import java.util.*;

public class q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		int value = 11;
		while(count < 11){
			if(containsEven(Integer.toString(value))){
				value++;
				continue;
			}
			if(isTrunc(value)){
				System.out.println("Value: " + value);
				sum += value;
				System.out.println("New Sum: " + sum);
				count++;
			}
			value += 2;
		}
		System.out.println("9 is prime: " +helpers.isPrime(9));
	}
	
	public static boolean containsEven(String s){
		int a = 0;
		for(a = 4; a < 9; a +=2){
			if(s.contains(Integer.toString(a))) return true;
		}
		return false;
	}
	
	public static boolean isTrunc(int i){
		//from the right
		int ten = 10;
		while(ten < i){
			if(!helpers.isPrime(i%ten)){
				return false;
			}
			ten *= 10;
		}
		//from left
		while(i > 0){
			if(!helpers.isPrime(i)){
				return false;
			}
			i /= 10;
		}
		
		return true;
	}

}
