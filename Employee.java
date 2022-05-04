//  private encapsulation using Getter and Setter methods

//to create employee class and print details of the employee


import java.util.Scanner;
class JobHolder
  {
    private int num;
    private String name;
    private String dept;
    private int salary;

    void setNum(int num)
    {
      this.num=num;
    }
    int getNum()
    {
      return this.num;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
    void setDept(String dept)
    {
      this.dept=dept;
    }
    String getDept()
    {
      return this.dept;
    }
    void setSalary(int salary)
    {
      this.salary=salary;
    }
    String getSalary()
    {
      return this.salary;
  }

public class Employee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        
        Employee emp1= new Employee();
        
        System.out.println("Enter Num:");
        emp1.setNum(sc.nextInt());

        System.out.println("Enter Name:");
        emp1.setName(sc.next());

        System.out.println("Enter Dept:");
        emp1.setDept(sc.next());

        System.out.println("Enter Salary:");
        emp1.setSalary(sc.nextInt());


      
       System.out.println(emp1.getNum()+" "+emp1.getName()+" "+emp1.getDept()+" "+emp1.getSalary());
    }
  }
  }



