
class Test{
	private String name="Sunny";
	protected int n= 10;
	public void msg(){
		System.out.println("hello "+name);
	}
}
public class A{
	public static void main(String a[]){
		Test t = new Test();
		t.msg();
		System.out.println(t.n);

	}	
}