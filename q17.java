import java.util.*;

public class q17 {

	public static Hashtable<Integer, Integer> hash;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count = 0;
		hash = new Hashtable<Integer, Integer>();
		hash.put(0, 0);
		hash.put(1, 3);
		hash.put(2, 3);
		hash.put(3, 5);
		hash.put(4, 4);
		hash.put(5, 4);
		hash.put(6, 3);
		hash.put(7, 5);
		hash.put(8, 5);
		hash.put(9, 4);
		hash.put(10, 3);
		hash.put(11, 6);
		hash.put(12, 6);
		hash.put(13, 8);
		hash.put(14, 8);
		hash.put(15, 7);
		hash.put(16, 7);
		hash.put(17, 9);
		hash.put(18, 8);
		hash.put(19, 8);
		hash.put(20, 6);
		hash.put(30, 6);
		hash.put(40, 5);
		hash.put(50, 5);
		hash.put(60, 5);
		hash.put(70, 7);
		hash.put(80, 6);
		hash.put(90, 6);
		hash.put(100, 7);
		
		for(int i = 0; i < 1000; ++i){
			count += lettersInNumber(i);
		}
		System.out.println(count);

	}
	public static int lettersInNumber(int x){
		
		int result = 0;
		
		if(x >= 100){
			int remainder = 0;
			int quotient;
			remainder = x % 100;
			quotient = (x - remainder)/100;
			result += hash.get(quotient);
			result += hash.get(100);
			if(remainder != 0)
				result += 3; //and
			x = remainder;
		}
		if(x >= 10){
			if(x < 21){
				result += hash.get(x);
				return result;
			}
			int remainder = x%10;
			int quotient = (x - remainder)/10;
			result += hash.get(quotient * 10);
			result += hash.get(remainder);
			return result;
			
		}
		if(x >= 1){
			result += hash.get(x);
		}
		
		return result;
	}

}
