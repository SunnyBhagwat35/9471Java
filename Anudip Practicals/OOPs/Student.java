import java.util.*;
class Student{
	int id;
	String name, surname;

	Student(int id, String name, String surname){
		this.name = name;
		this.id = id;
		this.surname = surname;
	}

	void details(){
		System.out.println("id: "+ this.id +" name: "+ this.name+" "+ this.surname);
	}

	int getId(){
		return this.id;
	}

	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		String name = scan.next();
		// scan.next();
		String surname = scan.next();
		
		Student obj = new Student(id, name, surname);
		obj.details();
		System.out.println("id is: "+obj.getId());
		
		id = scan.nextInt();
		name = scan.next();
		// scan.next();
		surname = scan.next();

		Student obj2 = new Student(id, name, surname);
		obj2.details();	
		System.out.println("id is: "+obj2.getId());
	}
}