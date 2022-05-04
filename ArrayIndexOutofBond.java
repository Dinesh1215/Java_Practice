//Array Index Out of Bond Exception 


 import java.util.Scanner;
 class ArrayIndexOutofBond
  {
    public static void main(String args[])
    {
      int i;
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Elements:");

      for(i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
          {
            System.out.println(a[6]);
          }
        }
    }
  }