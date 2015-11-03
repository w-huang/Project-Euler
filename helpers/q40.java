package helpers;
import java.util.*;
public class q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = dn(1);
		int i = 10;
		for(i = 10; i < 1000001; i*= 10){
			res *= dn(i);
		}
		System.out.println(dn(12));
		
	}
	
	public static void printArray(int[] a){
		for(int i = 0; i < a.length; ++i){
			System.out.print(a[i] + " ");
		}
	}
	public static int dn(int m){
		int n = m;
		int res = 0;
		int i = 0;
		while(n > helpers.numDigits(i)){
			n -= helpers.numDigits(i);
			++i;
			res = i;
		}
		String s = Integer.toString(res);
		int index = 0;
		while(n > 0){
			index++;
			n--;
		}
		
		return Character.getNumericValue(s.charAt(index - 1));
	}

}
