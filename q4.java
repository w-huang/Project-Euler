
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 999;
		int b = 999;
		int largestpalindrome = 0;
		for(int i = a; i > 99; --i){
			for(int j = b; j > 99; --j){
				if (ifPalindrome(Integer.toString(i*j))){
					if(i*j > largestpalindrome)
						largestpalindrome = i*j;
				}
			}
		}
		System.out.println(largestpalindrome);
	}

	public static boolean ifPalindrome(String n){
		int length = n.length();
		int halflength = (int)(length/2);
		
		for(int i = 0; i <= halflength; i++){
			if (n.charAt(i) != n.charAt(length -1 - i))
				return false;
		}
		return true;
	}
}
