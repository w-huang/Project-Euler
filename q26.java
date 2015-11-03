
import java.math.*;
import java.util.*;

import helpers.helpers;
public class q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flag = new int[1000];
		for(int i = 1; i < 1001; ++i){
			if(repeats(i)) flag[i-1] = 1;
		}
		
	}

	public static boolean repeats(int x){
		ArrayList<int[]> primes = helpers.primeFactors((long) x);
		for(int i = 0; i < primes.size(); ++i){
			if(primes.get(i)[0] != 2 || primes.get(i)[0] != 5) return true;
		}
		return false;
	}
}
