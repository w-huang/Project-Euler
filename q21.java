import java.util.*;
public class q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Integer> amicableNumbers = new Hashtable<Integer,Integer>();
		int result = 0;
		for(int i = 0; i < 10000; ++i){
			int sumOfDivs = sumOfDivisors(i);
			if(amicableNumbers.containsKey(sumOfDivs) && amicableNumbers.get(sumOfDivs) == i){
				result += i + sumOfDivs;
			}else if(!amicableNumbers.containsKey(sumOfDivs)){
				amicableNumbers.put(i, sumOfDivs);
			}
		}
		System.out.println(result);
	}

	public static int sumOfDivisors(int x){
		int result = 0;
		for(int i = 1; i < x ; ++i ){
			if(x % i == 0)
				result += i;
		}
		return result;
	}
}
