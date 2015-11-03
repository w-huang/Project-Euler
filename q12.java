import helpers.helpers;
import java.util.*;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		long value;
		int totalFactors = 0;
		while (totalFactors < 500){
			value = n * (n + 1)/2;
			ArrayList<int[]> factors = helpers.primeFactors(value);
			totalFactors = numberOfFactors(factors);
			n++;
		}
		System.out.println(n);
	}

	public static int numberOfFactors(ArrayList<int[]> primeFactors){
		int numPrimeFactors = primeFactors.size();
		int totalFactors = 1;
		for(int i = 0; i<numPrimeFactors; ++i){
			totalFactors *= (primeFactors.get(i)[1] + 1);
		}
		return totalFactors;
	}
}
