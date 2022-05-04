//Write a JAVAprogram to input week number and print week day.

import java.util.Scanner;
class WeekDay
  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weekday number: ");
        int weekday=sc.nextInt();

      if(weekday==1)
      {
        System.out.println("Sunday");
      }
      else if(weekday==2)
      {
        System.out.println("Monday");
      }
      else if(weekday==3)
      {
        System.out.println("Tuesday");
      }
      else if(weekday==4)
      {
        System.out.println("Wednesday");
      }
      else if(weekday==5)
      {
        System.out.println("Thursday");
      }
      else if(weekday==6)
      {
        System.out.println("Friday");
      }
      else if(weekday==7)
      {
        System.out.println("Saturday");
      }
      else
      {
        System.out.println("please enter weekday number between 1-7 ");
      }
    }
  }