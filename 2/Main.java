// Write a program in Java to display the cube of the number upto given an integer. Go to the editor

// Test Data Input number of terms : 4 Expected Output :
//      Number is : 4 and cube of 4 is : 64

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Enter number to find out the cube: ");
        int i = new Scanner(System.in).nextInt();
        System.out.println("Number is: "+i+" and cube of "+i+" is: "+i*i*i);
    }
}