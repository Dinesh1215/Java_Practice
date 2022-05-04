//to print odd numbers in an array

import java.util.Scanner;
  class ArrayOddNumbers
    {
      public static void main(String args[])
      {
         int a[] =new int[3];
       
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array");
        for(int i=0;i<3;i++)
            {
               a[i]=sc.nextInt();
            }
        for(int i=0;i<3;i++)
          {
            if(a[i]%2!=0)
            {
              System.out.println(a[i]);
            }
            
          }
        }
    }
       