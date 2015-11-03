import helpers.helpers;
import java.math.*;
public class q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 3; i < 1000001; ++i){
			String s = String.valueOf(i);
			String c = "2";
			if(s.contains(c) || !helpers.isPrime(i)) continue;
			if(checkCircular(i)){
				++count;
				System.out.println("Circular Prime: " + i);
			}
			
		}
		System.out.println(count);
	}
	
	public static boolean checkCircular(int i){
		
		int length = helpers.numDigits(i);
		for(int j = 1; j < length; ++j){
			int rem = i % 10;
			i /= 10;
			i += Math.pow(10, length-1) * rem;
			if(!helpers.isPrime(i)) return false;
		}
		
		
		return true;
	}

}
