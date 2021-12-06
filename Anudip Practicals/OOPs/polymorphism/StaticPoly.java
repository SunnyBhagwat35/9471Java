class MultiplyFun{
	static int Mul(int a, int b){
		return a * b;
	}
	static double Mul(double a, double b){
		return a * b;
	}
	static int Mul(int a, int b, int c){
		return a * b * c;
	}
}
class StaticPoly{
	public static void main(String asd[]){
 		System.out.println(MultiplyFun.Mul(2, 4));
        System.out.println(MultiplyFun.Mul(5.5, 6.3));
        System.out.println(MultiplyFun.Mul(2, 4, 6));
	}
}