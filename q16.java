import java.util.*;
import helpers.helpers;
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> result = new LinkedList<Integer>();
		result.add(2);
		System.out.println("Start");
		int count = 1;
		
		while (count < 1000){
			count++;
			result = helpers.arrayAdd(result, result);			
			System.out.print("Result Value: ");
		}
		
		long output = 0;
		for(int i = 0; i < result.size(); ++i){
			output += result.get(i);
		}
		System.out.println("end");
		
		System.out.println(output);
	}

}
