import java.util.Arrays;
class Arrayex{
	public static void main(String arp[]){
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		int[] a = {1,2,3,4,5};
		System.out.println(a.length);
		for(int i = 0; i < array.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n"+Arrays.toString(array));
	}
}