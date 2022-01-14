import java.util.*;
class Main{
    public static void main(String args[]){
        int[] array = {2,45,67,8,92,5};
        int size = array.length;
        int max = array[0], min = array[0];

        System.out.println("Array is: "+Arrays.toString(array));
        for(int i=1; i<size; i++){
             if(array[i] > max){
                 max = array[i];
             }
             if(array[i] < min){
                 min = array[i];
             }
        }
        System.out.println("max: "+ max +" min: "+min);
    }
}