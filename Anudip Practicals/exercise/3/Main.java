// Write a Java program that takes two numbers as input
// and display the product of two numbers. 
// Test Data: 
// Input first number: 25 Input second number: 5
// Expected Output : 25 x 5 = 125

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Enter first number: ");
        int i = new Scanner(System.in).nextInt();
        System.out.print("Enter second number: ");
        int j = new Scanner(System.in).nextInt();
        System.out.println(i+" x "+ j +" = " +i*j);
    }
}