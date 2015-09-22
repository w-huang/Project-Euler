
public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] latticePaths = new long[20];
		latticePaths[0] = 2;
		for(int i = 1; i < 20; ++i){
			latticePaths[i] = latticePaths[i-1] * 4 + 2 - (long) Math.pow(2, i+1);
			System.out.println(latticePaths[i]);
		}
		
	}

}
