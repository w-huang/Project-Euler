package helpers;
import java.util.*;
import java.math.*;
public class q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Boolean> ht = new Hashtable<String, Boolean>();
		BigDecimal x = new BigDecimal(0);
		for(int i = 2; i < 101; ++i){
			for(int j = 2; j < 101; ++j){
				x = BigDecimal.valueOf(i);
				x = x.pow(j);
				if(!ht.containsKey(x.toString())) ht.put(x.toString(), true);
			}
		}
		System.out.println(ht.keySet().size());
		
	}

}
