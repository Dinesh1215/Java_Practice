// to print 2 dimensional array

import java.util.Scanner;
  class TwoArraySample
    {
      public static void main(String args[])
      {
        
        int a[][] =new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array");
        
       for(int i=0;i<2;i++)
         {
           for(int j=0;j<3;j++)
             {
               a[i][j]=sc.nextInt();
             }
         }
        System.out.println("the array elements are:");
        for(int i=0;i<2;i++)
         {
           for(int j=0;j<3;j++)
             {
               System.out.print(a[i][j] + " ");
             }
           System.out.println();
        }
    }
    }
        