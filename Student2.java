//WAP to print student details including behaviour 
//WAP to print employee details including behaviour

class Details
  {
    String Name;
    int RollNumber;
    String Branch;

    void Reading()
    {
      System.out.println("Reading");
    }
    void Writing()
    {
      System.out.println("Writing");
    }
  }

  class Student2   //this is main method and main class and file name should be same
    {
      public static void main(String args[])
      {
        Student Std1=new Student();
        
        Std1.Name="Dinesh";
        Std1.RollNumber=49361;
        Std1.Branch="Civil Engineerng";
        
       //error Std1.Reading();       
       //error Std1.Writing();      



        System.out.println(Std1.Name+" "+Std1.RollNumber+" "+Std1.Branch);
        
      }
    }