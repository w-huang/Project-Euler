import java.util.*;
public class q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 1; i < 1000000; ++i){
			if(isPalindrome10(i) && isPalindrome2(i)){
				sum+= i;
				System.out.println("Decimal i:" + i + " Binary i: " + decToBin(i));
			}
		}
		
		System.out.println(sum);
		
		
	}
	
	public static boolean isPalindrome10(int x){
		String s = String.valueOf(x);
		
		for(int i = 0; i < s.length()/2; ++i){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		
		
		return true;
	}
	
	public static boolean isPalindrome2(int i){
		String s = decToBin(i);
		
		for(int j = 0; j < s.length(); ++j){
			if(s.charAt(j) != s.charAt(s.length()- 1 - j)) return false;
		}
		
		return true;
	}
	
	public static String decToBin(int i){
		int curr = 1;
		while(i >= curr){
			curr *=2;
		}
		curr /= 2;
		StringBuffer s = new StringBuffer();
		while(curr != 0){
			if(i >= curr){
				i -= curr;
				s.append(1);
			}else{
				s.append(0);
			}
			curr /= 2;
		}
		return s.toString();
		
		
		
	}

}
