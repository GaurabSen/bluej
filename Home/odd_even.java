import java.io.*;
import java.util.*;
import java.lang.*;
class odd_even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to be checked : ");
        int a=sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println("The number is an even number " +a);
        }
        if(a%2!=0)
        {
            System.out.println("The number is an odd number " +a);
        }
    }
}