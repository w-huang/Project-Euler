
import java.util.*;

public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[10];
		
		int perms = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2;
		for(int i = 0; i <10; ++i){
			n[i] = 0;
		}
		
		int counter = 1000000;
		int currentDigit = 0;
		int indexToSwap = 0;
		while(counter > 0){
			if(perms >= counter && counter != 1){
				System.out.println(counter);
				perms = perms/(9 - currentDigit);
				n[currentDigit] = indexToSwap;
				++currentDigit;
				indexToSwap = 0;
			}else{
				counter -= perms;
				indexToSwap++;
			}
		}
		System.out.println(ATS(n));
		int[] perm = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < n.length; ++i){
			//System.out.print("Original: " + ATS(perm) + "   ");
			int digitToMoveUp = perm[i + n[i]];
			int index = i + n[i];
			for(int j = index; j > i ; --j){
				perm[j] = perm[j - 1];
			}
			perm[i] = digitToMoveUp;
			//System.out.println("After: " + ATS(perm));
		}

		for(int i = 0; i < n.length; ++i){
			System.out.print(perm[i]);			
		}
		
}
	public static String ATS(int[] x){
		StringBuffer s = new StringBuffer();
		for(int i = 0; i < x.length; ++i){
			s.append(Integer.toString(x[i]));
		}
		return s.toString();
		
	}
	public static boolean containsUniqueDigits(long x){
		boolean[] flag;
		flag = new boolean[10];
		for(int i = 0; i < 10; ++i){
			long digit = x % 10;
			if(digit < 0) System.out.println(x + " " + i);
			if(flag[(int) digit]) return false;
			flag[(int) digit] = true;
			x -= (int) digit; x = x/10;
		}
		return true;
	}

}
