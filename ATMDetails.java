//WAP to print the details in atm machine


import java.util.Scanner;
class ATM 
  {
    int balance;
                  //withdraw details
    void withdraw(int amt)                                                              
    {
      if(balance>amt)
        {
          balance=balance-amt;
          System.out.println("withdraw successful");
        }
      else{
        System.out.println("Insufficient amount");
      }
    }
    //deposit details
void deposit(int amt)
    {
      balance=balance+amt;
      System.out.println("deposit successful");
    }
  //check balance

    void checkbalance()
    {
      System.out.println(balance);
      
    }
    
  }


    class ATMDetails
      {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          ATM atm=new ATM();
          atm.balance=25000;
          char ch='y';

          do
            {
              System.out.println("1.withdraw \n  2.Deposit \n  3.check balance");
              System.out.println("Select Option");
              int option=sc.nextInt();


              switch(option)
                {
                    case 1:
                    System.out.println("enter amount");
                    int amount=sc.nextInt();
                    atm.withdraw(amount);
                    break;


                    case 2:
                    System.out.println("enter amount");
                    int amt=sc.nextInt();
                    atm.deposit(amt);
                    break;


                  case 3:
                    atm.checkbalance();
                    break;

                  default:
                  System.out.println("invalid option");
                    
                }
              System.out.println("do you want to continue");
              ch=sc.next().charAt(0);
            }
            while(ch=='y');
        }
      }
                 