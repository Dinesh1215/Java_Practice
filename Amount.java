// WAP to print no of notes for given amount


import java.util.Scanner;
public class Amount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total amount:");
          int amount = sc.nextInt();

        while(amount>=2000)
          {
            if(amount>=2000)
            {
               System.out.println("No of 2000 notes:" +(amount/2000));
               amount=amount%2000;
            } 
            else if(amount>=500)
            {
              System.out.println("No of 500 notes:" +(amount%2000/500));
              amount=amount%2000/500;
            }
            else if(amount>=200)            
            {
              System.out.println("No of 200 notes:" +(amount%2000%500/200));
              amount=amount%2000%500/200;
            }
            else if(amount>=100)
            {
              System.out.println("No of 100 notes:" +(amount%2000%500/200));
              amount=amount%2000%500/200;
            }
            else if(amount>=50)
            {
              System.out.println("No of 50 notes:" +(amount%2000%500%200/50));
              amount=amount%2000%500%200/50;  
            }
            else if(amount>=20)
            {
              System.out.println("No of 20 notes:" +(amount%2000%500%200%50/20));
              amount=amount%2000%500%200%50/20;
            }
            else if(amount>=10)
            {
              System.out.println("No of 10 notes:" +(amount%2000%500%200%50%20/10));
              amount=amount%2000%500%200%50%20/10;
            }
            else if(amount>=5)
            {
              System.out.println("No of 5 notes:" +(amount%2000%500%200%50%20%10/5));
              amount=amount%2000%500%200%50%20%10/5;
            }
            else if(amount>=2)
            {
              System.out.println("No of 2 notes:" +(amount%2000%500%200%50%20%10%5/2));
              amount=amount%2000%500%200%50%20%10%5/2;
            }
            else if(amount>=1)
            {
              System.out.println("No of 2 notes:" +(amount%2000%500%200%50%20%10%5%2/1));
              amount=amount%2000%500%200%50%20%10%5%2/1;
            }
            }
          
      }
           
        
           
  }