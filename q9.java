
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hello");
		for (int i = 1; i <499; ++i){
			for (int j = 1; j < 499; ++j){
				if (isPerfectSquare(i * i + j*j) && (i + j + Math.sqrt(i*i + j*j)) == 1000){
					System.out.println(i);
					System.out.println(j);
				}
					
				
			}
		}
	}



	public static boolean isPerfectSquare(int n){
		int root = (int) Math.sqrt(n);
		if (root * root == n)
			return true;
		return false;
		
	}
}