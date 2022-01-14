import java.util.*;
class Main{
    public static void main(String args[]){
        int[] array = {2,45,67,8,92,5};
        int size = array.length;
        int[] a = new int[size];
        for(int i=0; i<size; i++){
                a[i] = array[i];            
        }
        System.out.println("Copied array: "+Arrays.toString(a));
    }
}