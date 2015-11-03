import java.util.*;
import helpers.pathNode;


public class q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "75" + "\n" + 
					"95 64" + "\n"+
					"17 47 82" + "\n"+
					"18 35 87 10" + "\n"+
					"20 04 82 47 65" + "\n"+
					"19 01 23 75 03 34" + "\n"+
					"88 02 77 73 07 63 67" + "\n"+
					"99 65 04 28 06 16 70 92" + "\n"+
					"41 41 26 56 83 40 80 70 33" + "\n"+
					"41 48 72 33 47 32 37 16 94 29" + "\n"+
					"53 71 44 65 25 43 91 52 97 51 14" + "\n"+
					"70 11 33 28 77 73 17 78 39 68 17 57" + "\n"+
					"91 71 52 38 17 14 91 43 58 50 27 29 48" + "\n"+
					"63 66 04 68 89 53 67 30 73 16 69 87 40 31" + "\n"+
					"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
		String[] arrayOfDataAsString = S.split("\n");
		LinkedList<pathNode> descendingRow = new LinkedList<pathNode>();
		
		descendingRow.add(new pathNode(1,0,75));
		
		for(int i = 1; i < arrayOfDataAsString.length; ++i){
			descendingRow = createRowOfPathNodes(descendingRow, i+1, createLinkedListOfValuesFromString(arrayOfDataAsString[i]));
		}
		long max = 0;
		for(int j = 0; j < descendingRow.size(); ++j){
			if (descendingRow.get(j).getSum() > max)
				max = descendingRow.get(j).getSum();
		}
		System.out.println(max);

	}
//pathNode previousNodeLeft, pathNode previousNodeRight, int row, int index, LinkedList<Integer> listOfValues
	
	public static LinkedList<pathNode> createRowOfPathNodes(LinkedList<pathNode> previousRow, int row, LinkedList<Integer> listOfValues){
		LinkedList<pathNode> returnRow = new LinkedList<pathNode>();
		
		returnRow.addFirst(new pathNode(previousRow.get(0), previousRow.get(0), row, 0, listOfValues));
		returnRow.addLast(new pathNode(previousRow.getLast(), previousRow.getLast(), row, row - 1, listOfValues));
		
		for(int i = 1; i < previousRow.size(); ++i){
			
			returnRow.add(returnRow.size() - 1, new pathNode(previousRow.get(i - 1), previousRow.get(i), row, i, listOfValues));
			
		}
		return returnRow;
	}



	public static LinkedList<Integer> createLinkedListOfValuesFromString(String rowAsString){
		LinkedList<Integer> listOfValues = new LinkedList<Integer>();
		
		String[] rowAsArrayOfString = rowAsString.split(" ");
		
		for(int i = 0; i < rowAsArrayOfString.length; ++i){
			listOfValues.addLast(Integer.parseInt(rowAsArrayOfString[i]));
		}
		return listOfValues;
	}	
	
}