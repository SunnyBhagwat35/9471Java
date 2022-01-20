import java.util.ArrayList;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();

	    list1.add("1");
	    list1.add("2");
	    list1.add("3");
	
	    System.out.println("ArrayList 1: "+ list1);
	
	    ArrayList<String> list2 = new ArrayList<String>();
	
	    list2.add("4");
	    list2.add("5");
	
	    System.out.println("ArrayList 2: "+ list2);

	    list1.addAll(list2);
	    System.out.println("Joined ArrayLists: "+ list1);
	}

}
