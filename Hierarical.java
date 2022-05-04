// to print student and employee details  Hierarical Inheritance


import java.util.Scanner;
class Person
  {
    String Name;
    int Id;
    String Dept;

    void Studying()
    {
      System.out.println("Working");
    }
  }
class Student extends Person
  {
    String Graduation;
    String PostGraduation;
    
    void Working()
    {
      System.out.println("Project");
    }
  }
class Employee extends Student
  {
    String Faculty;
    String Staff;
    int Salary;

    void Project()
    {
      System.out.println("Guiding");
    }
  }
class Hierarical
  {
    public static void main(String args[])
    {
      Student Std=new Std();
      Std.Name="Dinesh";
      Std.Id  =49631;
      Std.Dept="Civil Engineering";

      System.out.println(Std.Name+" "+Std.Id+" "+Std.Dept);
     

      Employee Emp=new Emp();
      Emp.Name="Krishna";
      Emp.Id  =49632;
      Emp.Dept="Civil Engineering";
      Emp.Salary=35000;

      System.out.println(Emp.Name+" "+Emp.Id+" "+Emp.Dept+" "+Emp.Salary);
      

      
     
      
    }
  }