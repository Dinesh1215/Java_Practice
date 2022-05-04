//Try and Catch Exceptions

import java.util.Scanner;
class TryandCatch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1st Number:");
        int a=sc.nextInt();

        System.out.println("Enter 2st Number:");
        int b=sc.nextInt();

      try
        {
          System.out.println(a/b);     //Exception generated code
        }
      catch(Exception e)       // to handle exception code
        {
          System.out.println("Arithmetic Exception :");
        }
        
    }
  }