import java.io.*;
import java.lang.*;
import java.util.*;
class Even_Odd_Loop3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for even check and 2 for odd check");
        int a=sc.nextInt();
        if(a<1)
        {
            System.out.println("Not Found");
        }
        if(a>2)
        {
            System.out.println("Not Found");
        }
        if(a==1)
        {
            Scanner evn=new Scanner(System.in);
            System.out.println("Maximum no to be checked for even: ");
            int n=evn.nextInt();
        
               for(int i=1;i<n;i++)
              {
                if(i%2==0)
                {
                  System.out.println(i);
                }
              }
        }
        if(a==2)
        {
            Scanner odd=new Scanner(System.in);
            System.out.println("Maximum no to be checked for even: ");
            int n=odd.nextInt();
        
            for(int i=1;i<n;i++)
            {
                if(i%2!=0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}