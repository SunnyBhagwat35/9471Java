import java.util.*;
class Main{

    public static void findIndex(int[] arr, int item){
         for(int i=0; i<arr.length; i++){
           if(arr[i] == item){
               System.out.println("Tha value "+ item +" Present at index "+ i);
               return;
           }
        }
        System.out.println("Tha value "+ item +" does not present in given arrray ");
    }
    public static void main(String args[]){
        int[] array = {2,45,67,8,92,5};
        findIndex(array, 45);
        findIndex(array, 1);
    }
}