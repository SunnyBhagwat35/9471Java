// Write a Java program to get a number from the user and print whether it is positive or negative.

// Test Data Input number: 35 
// Expected Output : Number is positive

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Input a number: ");
        int n = new Scanner(System.in).nextInt();
        if(n < 0){
            System.out.print("Number is negative");
        }
        else if(n==0){
            System.out.print("Number is not negative nor positive");
        }
        else{
            System.out.println("Number is positive");
        }
        

    }
}