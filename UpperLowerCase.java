//Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;
class UpperLowerCase
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the character: ");
      ch=sc.next().charAt(0);

      if(ch>='A' && ch<='Z')
         {
           System.out.println("It is upper case alphabet: ");
         }
      else
        {
          System.out.println("It is lower case alphabet: ");
        }
    }
  }