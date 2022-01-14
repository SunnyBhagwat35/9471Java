import java.util.*;
class Main{
    public static void main(String args[]){
        int[] array = {2,45,67,8,92,5};
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Average value of array "+Arrays.toString(array)+" is "+ sum/array.length);
    }
}