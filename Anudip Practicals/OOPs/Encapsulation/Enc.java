class EncDemo{
	private String Pstring;
	private int Pint;

	public void setString(String a){
		Pstring = a;
	}
	public void getString(){
		System.out.println("String is: "+ Pstring);
	}
	public void setInt(int a){
		Pint = a;
	}
	public void getInt(){
		System.out.println("Integer is: "+ Pint);
	}
}

class Enc{
	public static void main(String args[]){
		EncDemo obj = new EncDemo();
		obj.setString("Here is the string");
		obj.getString();
		obj.setInt(1456);
		obj.getInt();
	}
}