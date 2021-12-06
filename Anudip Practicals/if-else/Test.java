class Test{
	public static void main(String a[]){
		int n= 1234;

		if(n<100 && n >=1){
			System.out.println("number is two digit");
		}
		else if(n >=100 && n <= 999){
			System.out.println("number is three digit");
		}
		else if(n>=1000 && n <= 9999){
			System.out.println("number is four digit");
		}
		else if(n >= 10000 &&  n <= 99999){
			System.out.println("number is five digit");
		}
		else{
			System.out.println("number is not present between 1 to 99999");
		}
	}
}