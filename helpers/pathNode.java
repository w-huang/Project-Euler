package helpers;
import java.util.*;
public class pathNode {
	private int row;
	private int index;
	private long sum;
	
	public pathNode(pathNode previousNodeLeft, pathNode previousNodeRight, int row, int index, LinkedList<Integer> listOfValues){
		this.row = row;
		this.index = index;
		int currentValue = listOfValues.get(index);
		if(index == 0){
			this.sum = previousNodeRight.sum + currentValue;
		}else if(index == listOfValues.size() - 1){
			this.sum = previousNodeLeft.sum + currentValue;
		}else{
			this.sum = previousNodeLeft.sum > previousNodeRight.sum? previousNodeLeft.sum + currentValue : previousNodeRight.sum + currentValue;
		}
	}
	
	public pathNode(int row, int index, long sum){
		this.row = row;
		this.sum = sum;
		this.index = index;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getIndex(){
		return index;
	}
	
	public long getSum(){
		return sum;
	}

}
