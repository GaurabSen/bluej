import java.io.*;
import java.util.*;
import java.lang.*;
class Loop2
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Maximum no to be checked for even: ");
        int n=sc.nextInt();
        
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}