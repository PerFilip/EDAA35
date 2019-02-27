import java.util.LinkedList;

public class testSort 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(3);
        ll.add(7);
        ll.add(20);
        ll.add(1);
        ll.add(3);
        System.out.print(ll.toString());
        LinkedList<Integer> sorted = ListSorter.sort(ll);
        System.out.println(sorted.toString());
    }
}