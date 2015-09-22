
public class q14 {

	public static void main(String[] args) {
		long maxLength = 0;
		long maxLengthIndex = 0;
		long[] collatzLengths = new long[1000000];
		long n;
		for(long i = 1; i < 1000001; ++i){
			int currentLength = 1;
			n = i;
			while(n > 1){
				if( n < 1000000 && collatzLengths[(int) (n-1)] != 0){
					currentLength += collatzLengths[(int)n-1];
					break;
				}
				if (n%2 == 0){
					n /= 2;
				}else{
					n = 3*n + 1;
				}
				++currentLength;
			}
			collatzLengths[(int) (i-1)] = currentLength;
			if(currentLength>maxLength){
				maxLength = currentLength;
				maxLengthIndex = i;
			}
		}
		System.out.println(maxLengthIndex);
	}

}
