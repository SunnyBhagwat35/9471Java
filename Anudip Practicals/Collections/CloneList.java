import java.util.ArrayList;
public class CloneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
	    list1.add("2");
	    list1.add("3");
	
	    System.out.println("ArrayList 1: "+ list1);
	    
	    ArrayList<String> cloneList = new ArrayList<String>();
	    cloneList =  (ArrayList)list1.clone();
	    
	    System.out.println("ArrayList 2: "+ cloneList);

	}

}
