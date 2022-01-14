import java.util.*;
class Main{

    public static boolean contains(int[] arr, int item){
         for(int i=0; i<arr.length; i++){
           if(arr[i] == item){
               return true;
           }
        }
        return false;
    }
    public static void main(String args[]){
        int[] array = {2,45,67,8,92,5};
        System.out.println(contains(array, 45));
        System.out.println(contains(array, 1));
    }
}