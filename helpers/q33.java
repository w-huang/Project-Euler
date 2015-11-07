package helpers;

public class q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i = 10; i < 100; ++i){
			for(int j = 10; j < 100; ++j){
				if(i == j || (i%10 == 0 && j%10 == 0)) continue;
				else if(goodMath(i,j)[0] == badMath(i,j)[0] && goodMath(i,j)[1] == badMath(i,j)[1] && goodMath(i,j)[1] != j && goodMath(i,j)[0] != i){
					System.out.println("I: " + i + " J: " + j);
					System.out.println("Good math: " + helpers.arrayToString(goodMath(i,j)) + "Bad math: " + helpers.arrayToString(badMath(i,j)));
				}
			}
		}*/
		helpers.printArray(goodMath(26 * 19 * 16 * 49, 65*64*95*98));
	}
	
	public static int[] goodMath(int n, int d){
		int[] res = new int[2];
		int val = 2;
		while(!helpers.isPrime(n) && val < n){
			if(n % val == 0 && d % val == 0){
				n /= val;
				d /= val;
			}else{
				++val;	
			}
		}
		res[0] = n;
		res[1] = d;
		return res;
	}
	
	public static int[] badMath(int n, int d){
		int[] res = new int[2];
		int[] t1 = new int[2];
		int[] t2 = new int[2];

		t1[0] = n/10;
		t1[1] = n%10;
		t2[0] = d/10;
		t2[1] = d%10;

		for(int i = 0; i < 2; ++i){
			for(int j = 0; j < 2; ++j){
				if(t1[i] == t2[j] && t1[i] != 0){
					t1[i] = -1;
					t2[j] = -1;
					res[0] = t1[0] < 0 ? t1[1] : t1[0];
					res[1] = t2[0] < 0 ? t2[1] : t2[0];
					return res;
				}
			}
		}
		res[0] = n;
		res[1] = d;
		return res;
	}
}
