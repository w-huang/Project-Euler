
import java.math.*;

public class q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger fib1 = BigInteger.valueOf(1);
		BigInteger fib2 = BigInteger.valueOf(1);
		int counter = 2;
		while(fib1.toString().length() < 1000 && fib2.toString().length() < 1000){
			int x = fib1.compareTo(fib2);
			if(x > 0){
				fib2 = fib2.add(fib1);
			}else{
				fib1 = fib1.add(fib2);
			}
			counter++;
		}
		System.out.println(counter);
	}

	public static long fib(int index){
		if(index == 1 || index == 0){
			return 1;
		}
		return fib(index - 1) + fib(index - 2);
	}
}
