
public class q6 {

	public static void main(String[] args) {
		long a = 0;
		long b = (50 * 101) * (50 * 101);
		long c;
		for(int i =1; i <= 100; i++){
			a += (i * i);
			}
		if(a > b)
			c = a - b;
		else 
			c = b - a;
		System.out.println(c);
		
	}

}
