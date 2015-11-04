

public class q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currSquareSize = 3;
		int count = 0;
		int numTimesAdded = 0;
		long sum = 1;
		for(int i = 2; i < 1001 * 1001 + 1; ++i){
			if(numTimesAdded == 4){
				currSquareSize += 2;
				numTimesAdded = 0;
			}
			if(count == currSquareSize - 2){
				
				numTimesAdded++;
				count = 0;
				sum+=i;
			}else count++;
			if(i < 26){
				System.out.println(i + ": currSquare Size: " + currSquareSize + " numTimesAdded: " + numTimesAdded + "count: " + count);
			}
		}
		System.out.println(sum);
		
	}

}
