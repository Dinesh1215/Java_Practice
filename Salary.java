//Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
    //BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
    //BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
    //BasiJAVASalary > 20000 : HRA = 30%, DA = 95%


 import java.util.Scanner;
class Salary
  {
   public static void main(String args[])
    {
      float bs=0,gs=0,da=0,hra=0;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter basic salary");
        bs=s.nextFloat();
        
        hra=(bs/100)*56;
        da=(bs/100)*90;
        
        gs=hra+da+bs;
        System.out.println("Hra amount: "+hra);
        System.out.println("Da amount: "+da);
        System.out.println("Gross salary is : "+gs);
        
    }
  }