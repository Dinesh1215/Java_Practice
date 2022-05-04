
import java.util.Scanner;
  class ArraySample
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
            System.out.println(a[i]);
          }
        }
    }
       
        
       
    