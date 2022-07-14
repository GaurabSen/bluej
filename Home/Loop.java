import java.io.*;
import java.util.*;
import java.lang.*;
class Loop
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of time to be printed : ");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}