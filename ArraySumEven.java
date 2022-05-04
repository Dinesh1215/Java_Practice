//to print sum of even numbers in an array

import java.util.Scanner;
  class ArraySumEven
    {
      public static void main(String args[])
      {
         int a[] =new int[3];
         int min=a[0];
         int sum=0;
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array");
        for(int i=0;i<3;i++)
            {
               a[i]=sc.nextInt();
            }
        for(int i=0;i<3;i++)
          {
            if(a[i]%2==0)
            sum=sum+a[i];
              
            {
              System.out.println(sum);    
            }
            
          }
        }
    }
       