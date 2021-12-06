class Teacher{

	String designation="teacher";
	String collegeName="GVA";
}
public class PhysicsTeacher extends Teacher{
	String subject = "Physics";

	public static void main(String a[]){
		PhysicsTeacher pt = new PhysicsTeacher();

		System.out.println("designation: "+ pt.designation);
		System.out.println("CollegeName: "+ pt.collegeName);
		System.out.println("subject: "+ pt.subject);
	}
}