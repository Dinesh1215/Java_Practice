//to find negative numbers in a given array

import java.util.Scanner;
  class Negative
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
        System.out.println("the negative numbers in the array:");
        for(int i=0;i<3;i++)
          {
            if(a[i]<0)
            System.out.println(a[i]);
          }
        }
    }




          //if(a[i]%5==0)
            //System.out.println(a[i]);
       

