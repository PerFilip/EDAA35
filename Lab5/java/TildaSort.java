import java.util.LinkedList;

public class TildaSort {
	
	public void sort(LinkedList<Integer> list){
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		for(int i : list){
			int index = 0;
			for(int j = 0; j < sortedList.size(); j++){
				index = j;
				if(sortedList.get(j) >= i){
					break;
				} else {
					index=j+1;
				}
			}
			sortedList.add(index, i);
		}
	}

}
