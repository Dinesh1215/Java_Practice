//write a java program to check whether a character is alphabet or not.

import java.util.Scanner;
class AlphabetOrNot
  {
    public static void main(String args[])
    {
      char ch;
      Scanner s=new Scanner(System.in);
        System.out.println("Enter the character ");
        ch=s.next().charAt(0);
      
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
          System.out.println(ch+" is an alphabet");
        }
        else
        {
          System.out.println(ch+" is not an alphabet");
        }
        
    }
}
    