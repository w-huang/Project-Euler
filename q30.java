import java.math.*;
import java.util.*;
public class q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i = 10; i < 1000000; ++i){
			if( i == digitsPower(i, 5)){
				System.out.println("i: " + i);
				result += i;
			}
		}
		System.out.println("Sum: " + result);
	}

	public static int digitsPower(int x, int y){
		//returns the sum of the digits of x, raised to the power of y 
		
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int i = 0;
		while(x > 0){
			digits.add(x % 10);
			++i;
			x = x/10;
		}
		i = 0;
		for(int j = 0; j < digits.size(); ++j){
			i += Math.pow(digits.get(j), y);
		}
		return i;
	}
}
