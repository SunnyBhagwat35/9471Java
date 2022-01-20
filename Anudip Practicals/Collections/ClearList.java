import java.util.ArrayList;

public class ClearList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
	    list1.add("2");
	    list1.add("3");
	
	    System.out.println("ArrayList 1: "+ list1);
	    
	    list1.clear();
	    System.out.println("ArrayList 1: "+ list1);
	    
	    //checking Array list is empty or not
	    boolean ans = list1.isEmpty();
	    
	    if(ans) {
	    	System.out.println("ArrayList 1 is empty");
	    }
	    else {
	    	System.out.println("ArrayList 1 is not empty");
	    }
	}

}
