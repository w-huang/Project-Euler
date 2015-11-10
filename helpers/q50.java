package helpers;
import java.util.*;

public class q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> primes = new LinkedList<Integer>();
		long sum = 0;
		int i = 2;
		while(sum + i < 1000000){
			if(helpers.isPrime(i)){
				sum += i;
				primes.add(i);
			}
			++i;
		}
		System.out.println(primes.size());
		int x = lengthOfConsecs(primes, sum, 0, primes.size() - 1);
		System.out.println(x);
	}
	
	public static int lengthOfConsecs(LinkedList<Integer> p, long sum, int head, int tail){
		try{
			if(tail - head == 1){
				return 1;
			}
			if(helpers.isPrime(sum)){
				return tail - head + 1;
			}
			int left = lengthOfConsecs(p, sum - p.get(tail), head, tail - 1);
			int right = lengthOfConsecs(p, sum - p.get(head), head + 1, tail);		
			return left > right ? left: right;
		}
		catch(StackOverflowError e){
			return 0;
		}
	}
}
