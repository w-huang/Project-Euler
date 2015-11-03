
import java.util.*;

public class q23 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		boolean[] flag;
		flag = new boolean[28123];
		
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i = 1; i < 28123; ++i){
			if(checkAbundance(i)){
				for(int j = 0; j < a.size(); ++j){
					if(a.get(j) + i >= 28123) continue;
					flag[a.get(j) + i] = true;
				}
				a.add(i);
				if( i < 28123 / 2) flag[2 * i] = true;
			}
		}
		long result = 0;
		for(int i = 0; i < 28123; ++i){
			if(!flag[i]) result += i;
		}
		System.out.println(result);
		
	}
	
	public static int sumOfDivs(int x){
		int sum = 0;
		for(int i = 1; i < x; ++i){
			if( x % i == 0)
				sum += i;
		}
		return sum;
	}
	
	public static boolean checkAbundance(int x){
		return sumOfDivs(x) > x;
	}

}
