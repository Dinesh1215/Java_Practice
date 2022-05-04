// WAP to count total no of notes in given amount

import java.util.Scanner;
   class Notes
     
   {
     public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int rupees;
       System.out.println("Enter Amount");
       rupees=sc.nextInt();
       
       System.out.println("Number of 2000 notes is:" +(rupees/2000));
       System.out.println("Number of 1000 notes is:" +(rupees%2000/1000));  
       System.out.println("Number of 500 notes  is:" +(rupees%2000%1000/500));
       System.out.println("Number of 200 notes  is:" +(rupees%2000%1000%500/200));
       System.out.println("Number of 100 notes is:" +(rupees%2000%1000%500%200/100));
       System.out.println("Number of 50 notes is:" +(rupees%2000%1000%500%200%100/50));
       System.out.println("Number of 20 notes is:" +(rupees%2000%1000%500%200%100%50/20));
       System.out.println("Number of 10 notes is:" +(rupees%2000%1000%500%200%100%50%20/10));
       System.out.println("Number of 5 notes is:" +(rupees%2000%1000%500%200%100%50%20%10/5));
       System.out.println("Number of 2 notes is:" +(rupees%2000%1000%500%200%100%50%20%10%5/2));
       System.out.println("Number of 1 notes is:"+ (rupees%2000%1000%500%200%100%50%20%10%5%2/1));
         
     }
     
   }