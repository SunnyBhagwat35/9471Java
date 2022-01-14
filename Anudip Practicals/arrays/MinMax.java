class MinMax{
	static void min(int[] a){
		int min = a[0];
		for(int i=0; i < a.length; i++){
			if(min > a[i]){
				min = a[i];
			}
		}
		System.out.println("minimum of give array is "+ min);
	}

	public static void main(String args[]){
		int[] a = {30,60,12,14};
		min(a);
	}
}