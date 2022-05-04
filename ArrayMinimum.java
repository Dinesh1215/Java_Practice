//to find minumum number in the array

import java.util.Scanner;
  class ArrayMinimum
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
        int min=a[0];
        System.out.println("entered elements are:");
        for(int i=0;i<2;i++)
          {
            if(a[i]<min)
            {
              min=a[i];
             
                System.out.println(min);
              
            }
            
          }
        }
    }
       
 //int a[] =new int[3];
        // int min=a[0];
       