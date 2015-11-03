import java.util.*;
import helpers.node;
import java.math.*;
public class q20 {

	public static void main(String[] args) {
		BigInteger x = BigInteger.valueOf(1);
		
		for(int i = 1; i < 101; ++i){
			x = x.multiply(BigInteger.valueOf(i));
		}
		System.out.println(x.toString());
		long result = 0;
		for(int i = 0; i < x.toString().length(); ++i){
			result += x.toString().charAt(i) - '0';
		}
		
		System.out.println(result);
	}
}



