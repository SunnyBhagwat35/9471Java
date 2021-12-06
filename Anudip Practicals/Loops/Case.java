import java.util.*;
class Case{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		switch(i){
			case 2:
				System.out.println("it is two");
				break;
			case 3:
				System.out.println("it is three");
				break;
			case 1:
				System.out.println("it is one");
				break;
			default:
				System.out.println("it is just another number");
		}
	}
}