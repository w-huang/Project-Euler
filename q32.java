import java.util.*;

public class q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Hashtable<Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
		int[] temp = new int[3];
		for(int i = 1; i < 1000; ++i){
			for(int j = 1; j < 20000/i; ++j){
				temp[0] = i; temp[1] = j; temp[2] = i * j;
				if(isPandigital(temp) && !ht.containsKey(temp[2])){
					System.out.println("The sequence is pandigital: " + temp[0] + " " + temp[1] + " " + temp[2]);
					sum += temp[2]; 
					ht.put(temp[2], true);
				}
			}
		}
	
		
		System.out.println(sum);
		
		
	}

	public static boolean isPandigital(int[] i){
		int digits = numDigits(i[0]) + numDigits(i[1]) + numDigits(i[2]);
		if(digits != 9) return false;
		
		
		StringBuffer s = new StringBuffer();
		s.append(i[0]); s.append(i[1]); s.append(i[2]);
		String test = s.toString();
		
		for(int j = 1; j < digits + 1; ++j){
			if(!test.contains(Integer.toString(j))) return false;
		}
		
		return true;
	}
	
	public static void printArray(int a[]){
		int j = 0;
		for(int i = 0; i < a.length; ++i){
			j *= 10;
			j += a[i];
		}
		System.out.println(j);
		return;
	}
	
	public static int numDigits(int i){
		int a = 0;
		while(i > 0){
			++a;
			i /= 10;
		}
		return a;
	}
	
	
}
