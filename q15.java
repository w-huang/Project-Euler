import java.util.*;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Long> list = new LinkedList<Long>();
		list.add(Long.valueOf(1));
		list.add(Long.valueOf(2));
		list.add(Long.valueOf(1));
		
		System.out.println("Value before starting: " + list.toString());
		for(int i = 2; i < 40; ++i){
			System.out.println("Current Iteration #: " + i + " " + list.toString());
			nextRow(list);
		}
		
		System.out.println(list.get(list.size()/2));
	}
	
	public static void nextRow(LinkedList<Long> x){
		x.add(Long.valueOf(1));
		for(int i = x.size() - 2; i > 0; --i){
			x.set(i, x.get(i) + x.get(i - 1));
		}
		return;
	}

}
