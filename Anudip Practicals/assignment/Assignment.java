class Assignment{
	public static void main(String args[]){
		int num1 = 100, num2 = 20;

		num2=num1;
		System.out.println("num2=num1: "+num2 );

		num2+=num1;
		System.out.println("num2+=num1: "+num2 );

		num2-=num1;
		System.out.println("num2-=num1: "+num2 );

		num2*=num1;
		System.out.println("num2*=num1: "+num2 );	

		num2/=num1;
		System.out.println("num2/=num1: "+num2 );

		num2%=num1;
		System.out.println("num2%=num1: "+num2 );
	}
}