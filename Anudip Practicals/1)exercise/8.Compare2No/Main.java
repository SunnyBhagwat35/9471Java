// Write a Java program to compare two numbers. Go to the editor 
// Input Data: Input first integer: 25 Input second integer: 39 
// Expected Output
// 25 != 39
// 25 < 39
// 25 <= 39

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Input first number: ");
        int n1 = new Scanner(System.in).nextInt();
        System.out.print("Input second number: ");
        int n2 = new Scanner(System.in).nextInt();

        if(n1 != n2){
            System.out.println(n1 +"!="+ n2);
        }
        if(n1 <= n2){
            System.out.println(n1 +"<="+ n2);
        }
        if(n1 >= n2){
            System.out.println(n1 +">="+ n2);
        }
        if(n1 > n2){
            System.out.println(n1 +">"+ n2);
        }
        if(n1 < n2){
            System.out.println(n1 +"<"+ n2);
        }
        if(n1 == n2){
            System.out.println(n1 +"=="+ n2);
        }
    }
}