
public class q3 {

	public static void main(String[] args) {
	
		long value = 600851475143L;
		long largestprime = 0L;
		
		for(int i = 2; i <= value; ++i){
			if(isPrime(i) && value%i == 0){
				System.out.println(i);
				value /= i;
				largestprime = i;
				}
			
			}
		System.out.println(largestprime);
		
		}
	
	public static boolean isPrime(int n){
		int root = (int)(Math.sqrt(n));
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
