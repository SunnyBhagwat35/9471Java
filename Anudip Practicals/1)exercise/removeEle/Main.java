import java.util.*;
class Main{

    public static void remove(int[] arr, int index){
        int size = arr.length;
        if(size < index){
            System.out.println("Entered index "+index+"greater than array size");
            return;
        }
        System.out.println(Arrays.toString(arr));
        int[] a = new int[size-1];
        for(int i=0; i<size-1; i++){
            if(i >= index){
                a[i] = arr[i+1];
            }
            else{
                a[i] = arr[i];
            }
            
        }

        System.out.println("After removing the element at index: "+index+" "+Arrays.toString(a));

    }
    public static void main(String args[]){
        int[] array = {2,45,67,8,92,5};
        System.out.println("Enter index to be removed ");
        int index = new Scanner(System.in).nextInt();
        
        remove(array, index);

        
    }
}