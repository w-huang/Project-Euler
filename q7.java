
public class q7 {

	public static void main(String[] args) {
		long i = 1L;
		int count = 0;
		while (count < 10001){
			if(isPrime(i))
				++count;
			++i;
		}
		System.out.println(i - 1);
	}
	
	public static boolean isPrime(long n){
		int root = (int)(Math.sqrt(n));
		if (n == 1)
			return false;
		if (n == 2)
			return true;
		if (n%2 == 0)
			return false;
		for(int i = 1; (2*i + 1) <= root; ++i){
			if (n%(2*i+1) == 0)
				return false;
		}
		
		return true;
	}

}
