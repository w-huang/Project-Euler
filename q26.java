
import java.math.*;
import java.util.*;

import helpers.helpers;
public class q26 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1;
		int value = 1;
		for(int i = 2; i < 1001; ++i){
			int m = i;
			while(m%2 == 0){
				m /= 2;
			}
			while(m%5 == 0){
				m /= 5;
			}
			int k = lengthRepeat(m);
			if( k > max){
				max = k;
				value = i;
			}
		}
		System.out.println(value);
	}

	public static int lengthRepeat(int mantissa){
		BigDecimal i = new BigDecimal(9);
		while(i.remainder(BigDecimal.valueOf(mantissa)) != BigDecimal.ZERO){
			i = i.multiply(BigDecimal.valueOf(10)); 
			i = i.add(BigDecimal.valueOf(9));
		}
		return i.toString().length();
	}
	
}
