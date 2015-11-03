import java.util.*;
import helpers.helpers;

public class q31 {

	public static void main(String[] args) {		
			int[] d = {1,2,5,10,20,50,100,200};
			System.out.println(numWays(200, d));
	}
	
	public static int numWays(int total, int[] d){
		//System.out.println("The total to form: " + total + "The denominations usable: " + arrayToString(d));
		if(d.length <= 1 && total >= 0) return 1;
		if(total < 0) return 0;
		if(total == 0) return 1;
		
		int[] e = new int[d.length - 1];
		for(int i = 0; i < e.length; ++i){
			e[i] = d[i];
		}
		return numWays(total - d[d.length-1], d) + numWays(total, e);
	}
	
	public static String arrayToString(int[] d){
		StringBuffer s = new StringBuffer();
		for(int i = 0; i < d.length; ++i){
			s.append(d[i]);
		}
		return s.toString();
	}
	
	public static int a1(){
		int a = 0;
		for (int i = 0; i<2; i++)
		{
			if(200*i > 200)
				break;
			for(int j=0; j<3; j++)
			{
				if(200*i + 100*j> 200)
					break;
				for(int k=0; k<5; k++)
				{
					if(200*i + 100*j + 50*k> 200)
						break;
					for(int h=0; h<11; h++)
					{
						if(200*i + 100*j + 50*k + 20*h> 200)
							break;
						for(int g=0; g<21; g++)
						{
							if(200*i + 100*j + 50*k + 20*h + 10*g> 200)
								break;
							for(int f =0; f<41; f++ )
							{
								if(200*i + 100*j + 50*k + 20*h + 10*g + 5*f> 200)
									break;
								for(int d = 0; d< 101; d++)
								{
									if(200*i + 100*j + 50*k + 20*h + 10*g + 5*f + 2*d  > 200)
										break;
									for(int s=0; s<201; s++)
									{
										if(200*i + 100*j + 50*k + 20*h + 10*g + 5*f + 2*d + s > 200)
											break;
										if(200*i + 100*j + 50*k + 20*h + 10*g + 5*f + 2*d + s == 200)
											++a;
										
									}
								}
								
							}
						}
						}
					}
					
				}
			}
		return a;
	}
}
