
//adding elements at first and last of the list
import java.util.LinkedList;

public class LLadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
        ll.add("B");
        ll.add("C");
        System.out.println(ll);
        
        ll.addFirst("A");
        System.out.println(ll);
        
        ll.addLast("D");
        System.out.println(ll);
		
	}

}