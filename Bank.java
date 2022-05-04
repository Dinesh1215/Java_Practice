// to print rate of interest for the given banks like SBI and axis and hdfc also
// Abstraction Topic 0205

import java.util.Scanner;
abstract class Banks      //abstract class
  {
    long accountno;
    String panno;

    abstract void Rate_of_Interest();  //abstract method and we have to end with ;

    void display()    //non abstract method

    {
      System.out.println(accountno+" "+panno);
    }
    
  }

class SBI_Bank extends Banks   //sub class for SBI Bank.we can write for various bank classes
  {
    void Rate_of_Interest()
    {
      System.out.println("Rate of Interest for SBI Bank is 7.3% ");
    }
  }

class axis_Bank extends Banks   // sub class for axis bank
  {
    void Rate_of_Interest()
    {
      System.out.println("Rate of Interest for axis Bank is 14.3% ");
    }
  }


  class Bank
    {
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        Banks sbi=new SBI_Bank();    //bank constructor 
//we cant directly initilize bank class because it contains abstract method
       
        System.out.println("Enter Account No:");  // printing acc no
        sbi.accountno=sc.nextLong();
        
        System.out.println("Enter Pan No:");    // printing pan no
        sbi.panno=sc.next();

        sbi.display();           
        sbi.Rate_of_Interest();
        
      }
    } 



//insteed of SBI we can take axis also 

/*
  OUTPUT
  Enter Account No:
  20255555623
  Enter Pan No:
  BRMPB8819E
  20255555623 BRMPB8819E
  Rate of Interest for SBI Bank is 7.3%  */

