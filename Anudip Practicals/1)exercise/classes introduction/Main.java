// https://practice.geeksforgeeks.org/problems/java-classes-introduction/1/?category[]=Java&category[]=Java&page=1&query=category[]Javapage1category[]Java#
import java.io.*;
import java.util.Scanner;


class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
         int l,w,h;
         l=sc.nextInt();
         w=sc.nextInt();
         h=sc.nextInt();
         task obj=new task();
         obj.set_length(l);
         obj.set_width(w);
         obj.set_height(h);
         obj.volume();
        }
    }
}

class task
{
    int length;
    int width;
    int height;
    
    public void set_length(int l)
    {
        //Add your code here.
        this.length = l;
    }
    public void set_width(int w)
    {
        //Add your code here.
        this.width = w;
    }
    public void set_height(int h)
    {
        //Add your code here.
        this.height = h;
    }
    public void volume()
    {
        //Add your code here.
        System.out.println(length*width*height);
        
    }
}
