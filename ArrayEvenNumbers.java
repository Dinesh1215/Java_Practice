//to print even numbers in an array

import java.util.Scanner;
  class ArrayEvenNumbers
    {
      public static void main(String args[])
      {
         int a[] =new int[3];
        int min=a[0];
        //int =sum;    sum
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array");
        for(int i=0;i<3;i++)
            {
               a[i]=sc.nextInt();
            }
        for(int i=0;i<3;i++)
          {
            if(a[i]%2==0)
           //sum=sum+a[i]    sum
              
            {
              System.out.println(a[i]);    //System.out.println(sum);   sum
            }
            
          }
        }
    }
       