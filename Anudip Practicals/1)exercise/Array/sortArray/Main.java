import java.util.*;

class Main{
    public static void main(String args[]){
        int[] array1 = {5,3,2,5,6,2,1};
        String[] array2 = {"sushi", "ramen", "cake", "Nabemono", "Dongo"};
        int temp;
        System.out.println("Original integer array: "+Arrays.toString(array1));
        for(int i=1; i < array1.length; i++){
            for(int j=0; j < array1.length; j++){
                if(array1[j] > array1[i]){
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println("Sorted integer array: "+Arrays.toString(array1));
        String temp2;
        int size = array2.length;
        System.out.println("Original string array: "+Arrays.toString(array2));
         for(int i=0; i < size; i++){
            for(int j=i+1; j < size; j++){
                if(array2[i].compareTo(array2[j]) > 0){
                    temp2 = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp2;
                }
            }
         }

        
        System.out.println("Sorted string array: "+Arrays.toString(array2));
    }
}