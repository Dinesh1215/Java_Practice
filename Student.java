//WAP to enter student details

import java.util.Scanner;
class Student
  {
    int RollNumber;
    String Name;
    String Branch;
    

    public static void main(String args[])
    {
      Student St1=new Student();
      St1.Name="Dinesh";
      St1.RollNumber=49361;
      St1.Branch="Civil Engg";

      Student St2=new Student();
      St2.Name="Gopal";
      St2.RollNumber=49362;
      St2.Branch="Civil Engg";

      System.out.println(St1.Name+" "+St1.RollNumber+" "+St1.Branch);
      System.out.println(St2.Name+" "+St2.RollNumber+" "+St2.Branch);
    }
  }