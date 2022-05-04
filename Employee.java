//WAP to enter employee details   class and Object

import java.util.Scanner;
class Employee
  {
    String Name;
    int EmployeeNumber;
    String Dept;
    

    public static void main(String args[])
    {
      Employee Emp1=new Employee();
      Emp1.Name="Dinesh";
      Emp1.EmployeeNumber=49361;
      Emp1.Dept="Construction";
     
      

      Employee Emp2=new Employee();
      Emp2.Name="Gopal";
      Emp2.EmployeeNumber=49362;
      Emp2.Dept="Highway";
    


      Employee Emp3=new Employee();
      Emp3.Name="Durgesh";
      Emp3.EmployeeNumber=49363;
      Emp3.Dept="Structure";
     

      System.out.println(Emp1.Name+"   "+Emp1.EmployeeNumber+"    "+Emp1.Dept);
      System.out.println(Emp2.Name+"    "+Emp2.EmployeeNumber+"    "+Emp2.Dept);
      System.out.println(Emp3.Name+"  "+Emp3.EmployeeNumber+"    "+Emp3.Dept);
    }
  }