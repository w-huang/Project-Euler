
public class q5 {

	public static void main(String[] args) {
		long a = 1L;
		int n = 20;
		int m;
		for (int i = 2; i <= n; ++i){
			m = n;
			if(isPrime(i)){
				while(m>=i){
					a *= i;
					m /= i;
			
				}
			}
		}
		System.out.println(a);
	}
	
	public static boolean isPrime(int n){
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