//bank example using interface 


import java.util.Scanner;
interface Bank
  {
    long accountno=123456;
    public void rate_of_interest(); 
  }
class SBI_Bank implements Bank
  {
    public void rate_of_interest()
    {
      System.out.println("rate of interest of SBI id 7.3%");
    }
  }

class AXIs_Bank
  {
    public void rate_of_interest()
    {
      System.out.println("rate of interest of SBI id 12.7%");
    }
  }

class Banking
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bank sbi=new SBI_Bank();
      Bank axis=new AXIs_Bank();
      axis.rate_of_interest();
      sbi.rate_of_interest();
    }
  }