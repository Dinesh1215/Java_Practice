//to find maximum number in the array

import java.util.Scanner;
  class ArrayMaximum
    {
      public static void main(String args[])
      {
         int a[]=new int[2];
        
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array");
        for(int i=0;i<2;i++)
            {
               a[i]=sc.nextInt();
            }
        int max=a[0];
        System.out.println("entered elements are:");
        for(int i=0;i<2;i++)
          {
            if(a[i]>max)
            {
              max=a[i];
             
                System.out.println(max);
              
            }
            
          }
        }
    }
       