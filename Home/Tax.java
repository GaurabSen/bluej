import java.io.*;
import java.lang.*;
import java.util.*;
class Tax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary of the user : ");
        double sal=sc.nextDouble();
        double tax=0.0;
        
        if(sal<=100000)
        {
            tax=0.0;
        }
        else if ((sal>100001) && ( sal<=500000))
        {
         tax=((0.10*sal)+700);   
        }
        else if ((sal>500001) && (sal<=1000000))
        {
            tax=((0.20*sal)+2000);
        }
        else
        {
            tax=((0.30*sal)+5000);
        }
        
        System.out.println("Tax payable : "+tax);
    }
}