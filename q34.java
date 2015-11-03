
public class q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 0;
		for(long i = 3; i < 10000000; ++i){
			if(i == sumDigitsFactorially(i)){
				x += i;
			}
		}
		
		System.out.println(x);
		
	}
	
	public static long sumDigitsFactorially(long a){
		long sum = 0;
		long temp = a;
		while(temp > 0){
			sum += factorial(temp%10);
			temp /= 10;
		}
		return sum;
	}

	public static long factorial(long i){
		if(i ==0) return 1;
		long prod = 1;
		while(i > 1){
			prod *= i;
			--i;
		}
		return prod;
	}

}
