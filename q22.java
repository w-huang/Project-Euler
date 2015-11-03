import java.io.*;
import java.util.*;
import java.math.*;
public class q22 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();
		BufferedReader scan = new BufferedReader(new FileReader("src/Project-Euler/p022_names.txt"));
		String s1 = scan.readLine();
		String[] sa = s1.split(",");
		String[] test = {"ZULA", "WORLD", "ITS", "A", "NICE", "DAY"};
		sortLines(s, sa);
		
		Iterator<String> t = s.iterator();
		BigInteger result = BigInteger.valueOf(0);
		int counter = 1;
		while(t.hasNext()){
			String ss = t.next();
			int temp = 0;
			for(int i = 1; i < ss.length() - 1; ++i){
				temp += ss.charAt(i) - 'A' + 1;
				
			}
			result = result.add(BigInteger.valueOf(temp * counter));
			++counter;
		}
		System.out.println(result.toString());
	}
	
	public static void printLine(ArrayList<String> s1){
		Iterator<String> s = s1.iterator();
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}
	
	public static void sortLines(ArrayList<String> s, String[] s1){
		
		for(int i = 0; i < s1.length; ++i){
			int j = 0;
			if(s.size() == 0){
				s.add(s1[i]);
			}
			else{
				while(j < s.size() && alphabetize(s.get(j), s1[i])){
					j++;
				}
				if(j == s.size()) s.add(s1[i]); else s.add(j, s1[i]);
			}
		}
		return;
	}
	
	public static boolean alphabetize(String s1, String s2){
		//returns whether s1 comes before s2; aka true if s1 precedes s2
		if(s1 == "" || s2 == ""){
			return true;
		}
		int length = s1.length() > s2.length() ? s2.length() : s1.length();
		
		for(int i = 0; i < length; ++i){
			if((int) s1.charAt(i) - s2.charAt(i) < 0){
				return true;
			}else if((int) s1.charAt(i) - s2.charAt(i) > 0)
				return false;
		}
		return s1.length() < s2.length();
	}

}