//WAP to enter student details

import java.util.Scanner;
class Student1
  {
   
     int RollNumber;
      String Name;
      String Branch;
      
    

    public static void main(String args[])
    {
      Student Std1=new Student();
       
      Std1.RollNumber=49361;
      Std1.Name="Dinesh";
      Std1.Branch="Civil Engineering";

      
      Student Std2=new Student();
       
      Std2.RollNumber=49361;
      Std2.Name="Kusuma";
      Std2.Branch="Cooking Expert";
      


      System.out.println(Std1.RollNumber+"  "+Std1.Name+"  "+Std1.Branch);

      System.out.println(Std2.RollNumber+"  "+Std2.Name+"  "+Std2.Branch);

        
    }
     
       
     
      
    
  }