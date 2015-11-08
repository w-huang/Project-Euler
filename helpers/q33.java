package helpers;

public class q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int den = 1;
		for(int i = 10; i < 100; ++i){
			for(int j = 10; j < i; ++j){
				if(i == j || (i%10 == 0 && j%10 == 0)) continue;
				else{
					int goodNum = goodMath(j,i)[0];
					int goodDen = goodMath(j,i)[1];
					int badNum = badMath(j,i)[0];
					int badDen = badMath(j,i)[1];
					if(badNum == j && badDen == i){
						continue;
					}
					else if(goodMath(goodNum, goodDen)[0] == goodMath(badNum, badDen)[0] && goodMath(goodNum, goodDen)[1] == goodMath(badNum, badDen)[1])
					 {
						System.out.println("Before Multiplication: " + num + "/" + den);
						num *= i;
						den *= j;

						System.out.println("After Multiplication: " + num + "/" + den);
					}
				}
				if(num == 0 || den == 0){
					System.out.println(i);
					System.out.println(j);
					return;
				}
			}
		}
		System.out.println(num);
		System.out.println(den);
		helpers.printArray(goodMath(num,den));
	}
	
	public static int[] goodMath(int n, int d){
		int[] res = new int[2];
		int val = 2;
		while( val <= n){
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
