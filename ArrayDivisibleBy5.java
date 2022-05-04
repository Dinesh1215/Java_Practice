//WAP to to find an array which is divisible by 5

            //if(a[i]%5==0)
            //System.out.println(a[i]);


  import java.util.Scanner;
  class ArrayDivisibleBy5
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
            if(a[i]%5==0)
            System.out.println(a[i]);
          }
        }
    }