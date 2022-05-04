////Write a JAVAprogram to find maximum between three numbers

import java.util.Scanner;
public class ThreeNumbers
{
    public static void main(String args[])
    {
         int a;
         int b;
         int c;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter first number: ");
        a=sc.nextInt();
      
        System.out.println("Enter second number: ");
        b=sc.nextInt();

        System.out.println("Enter third number: ");
        c=sc.nextInt();
      
        if(a>b)
        {
          System.out.println("number one is maximum");
        }
        else if(b>c)
        {
          System.out.println("number two is maximum");
        }
        else if(c>a)
        {
          System.out.println("number three is maximum");
        }
      else
        {
          System.out.println("the numbers are same");
        }
    }
}