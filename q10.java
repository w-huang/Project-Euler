
public class q10 {

	public static void main(String[] args) {
		long c = 0;
		
		for (long i = 3; i < 2000000; ++i){
			if(isPrime(i))
				c += i;			
		}
		System.out.println(c);

	}
	
	public static boolean isPrime(long n){
		int root = (int) Math.floor((Math.sqrt(n)));
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
