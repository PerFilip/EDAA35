import java.util.LinkedList;
public class ListSorter
{
    public ListSorter()
    {
    }
    public static LinkedList<Integer> sort(LinkedList<Integer> linkedList)
    {
        LinkedList<Integer> sortedList = new LinkedList<>(); 
        for (int i = 0; i < linkedList.size(); i++)
        {
            int curElement = linkedList.get(i);
            for (int j = 0; j < linkedList.size();j++) {
                if (sortedList.size() == 0) {
                    sortedList.add(curElement);
                    break;
                }
                else if (j >= sortedList.size()) {
                    sortedList.addLast(curElement);
                    break;
                }
                else if (curElement < sortedList.get(j)) {
                    sortedList.add(j, curElement);
                    break;
                }
            } 
        }
        return sortedList;
    }
}