import java.util.*;
class Square{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no to declare size");
        int size = s.nextInt();

        for(int i=0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }
}