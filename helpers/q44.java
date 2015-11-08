package helpers;
import java.util.*;
import java.math.*;
public class q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> k = new HashSet<Integer>();
		for(int i = 1; i < Math.sqrt(Integer.MAX_VALUE) * 1/3; ++i){
			int penta = i * (3*i - 1) / 2;
			if(!k.contains(penta)) k.add(penta);
		}
		Iterator<Integer> x = k.iterator();
		int min = Integer.MAX_VALUE;
		while(x.hasNext()){
			int x1 = x.next();
			Iterator<Integer> y = k.iterator();
			while(y.hasNext()){
				int y1 = y.next();
				if(x1 > y1 && isPenta(x1 + y1) && isPenta(x1 - y1)){
					System.out.println("Success");
					min = x1 - y1 > min ? min : x1-y1;
				}
			}
		}
		System.out.println(min);
	}
	
	
	public static boolean isPenta(int p){
		long lp = 24 * p + 1;
		double d = Math.sqrt(lp);
		if(Math.floor(d) != d) return false;
		d += 1;
		return(((int) d) %6 == 0);
	}
	
}
