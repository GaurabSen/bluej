import java.io.*;
import java.util.*;
import java.lang.*;
class Acc_Velo_Spconv
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for Acceleration , 2 for velocity , 3 for Speed conversion ");
        int a=sc.nextInt();
        
        if(a<1)
        {
            System.out.println("Nothing Found ");
        }
        if(a==1)//Acceleration
        {
            Scanner acc=new Scanner(System.in);
            System.out.println("Enter the inital velocity : ");
            double u=acc.nextDouble();
            System.out.println("Enter the final velocity : ");
            double v=acc.nextDouble();
            System.out.println("Enter the time period: ");
            double t=acc.nextDouble();
            
            double b=0.0;
            
            if(v>u)
            {
                b=((v-u)/t);
                System.out.println("Acceleration ");
                System.out.println("Acceleration of : "+b);
            }
            if(v<u)
            {
                b=((v-u)/t);
                System.out.println("Retardation ");
                System.out.println("Acceleration of : "+b);
            }
        }
        if(a==2)//velocity
        {
            Scanner velo=new Scanner(System.in);
            System.out.println("Enter the displacement : ");
            double dis=velo.nextDouble();
            System.out.println("Enter the time period : ");
            double ti=velo.nextDouble();
            
            System.out.println("The Velocity Is : "+(dis/ti));
        }
        if(a==3)//speed converter
        {
            Scanner ac=new Scanner (System.in);
            System.out.println("Conversion from km/h to m/s  press 1 or vice versa then press 2");
            int con=ac.nextInt();
            
            if(con<1)
            {
                System.out.println("Not Found");
            }
            if(con==1)
            {
                Scanner kmph =new Scanner (System.in);
                System.out.println("Enter the Speed is km/h : ");
                double km=kmph.nextDouble();
                
                System.out.println("Speed in m/s is "+((km*5)/18));
            }
            if(con==2)
            {
                Scanner mps =new Scanner (System.in);
                System.out.println("Enter the Speed is m/s : ");
                double m=mps.nextDouble();
                
                System.out.println("Speed in km/h is "+((m*18)/15));
            }
            if(con>2)
            {
                System.out.println("Not Found ");
            }
        }
        if(a>3)
        {
            System.out.println("Nothing Found ");
        }
    }
}