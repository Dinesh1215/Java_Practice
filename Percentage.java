//Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology,     
//Mathematics and Computer. Calculate percentage and grade according to     following:
    //Percentage >= 90% : Grade A
    //Percentage >= 80% : Grade B
   // Percentage >= 70% : Grade C
    //Percentage >= 60% : Grade D
    //Percentage >= 40% : Grade E
    //Percentage < 40% : Grade F

  import java.util.Scanner;
  class Percentage
  {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
        System.out.println("Enter the marks of five subjects::\n");
        float physics=in.nextFloat();
        float chemistry=in.nextFloat();
        float biology=in.nextFloat();
        float mathematics=in.nextFloat();
        float computer=in.nextFloat();

        float total;
        float average;
        float percentage;
        
      
        total=physics+chemistry+biology+mathematics+computer;
        average=(float)(total / 5.0);
        percentage=(float)((total / 500.0) * 100);
      
        if (average >= 90)
        {
          System.out.println("Grade is A");
        }
        else if (average>=80 && average<90)
        {
          System.out.println("Grade is B");
        }
        else if (average>=70 && average<80)
        {
          System.out.println("Grade is C");
        }
        else if (average>=60 && average<70)
        {
          System.out.println("Grade is D");
        }
        else if(average>=40 && average<50)
        {
          System.out.println("Grade is E");
        }
        else
        {
          System.out.println("Grade F");
        }
        System.out.println("\nThe Total marks = " + total + "/500.0");
        System.out.println("The Average marks is = " + average);
        System.out.println("The Percentage is= " + percentage + "%");
        
    }
}
   