//Write a JAVAprogram to find maximum between two numbers.

import java.util.Scanner;
public class TwoNumbers
{
    public static void main(String args[])
    {
         int a;
         int b;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
      
        System.out.println("Enter thes second number: ");
        b=sc.nextInt();
      
        if(a>b)
        {
          System.out.println("number one is maximum");
        }
        else
        {
          System.out.println("number two is maximum");
        }
        
    }
}