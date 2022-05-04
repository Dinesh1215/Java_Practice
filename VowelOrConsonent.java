//Write a JAVAprogram to input any alphabet and check whether it is vowel or    consonant.


 import java.util.Scanner;
 class VowelOrConsonent
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character");
      ch=sc.next().charAt(0);

      if(ch=='a'||ch=='A')
      {
       System.out.println("its a vowel"); 
      }
      else if(ch=='e'||ch=='E')
      {
        System.out.println("its a vowel");
      }
      else if(ch=='i'||ch=='I')
        {
        System.out.println("its a vowel");
        }
        else if(ch=='o'||ch=='O')
          {
        System.out.println("its a vowel");
          }
      else if(ch=='u'||ch=='U')
        {
        System.out.println("its a vowel");
        }
      else 
      {
        System.out.println("its a consonent");
      }
      
    }
  }
   