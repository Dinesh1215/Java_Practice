// compile type polymerphism

import java.util.Scanner;
class Addition
  {
    int add(int a,int b)
    {
      return(a+b);
    }
    int add(int a,int b,int c)
    {
      return(a+b+c);
    }
    double add(double a,double b)
    {
      return(a+b);
    }
  }
class CompileType
  {
    public static void main(String args[])
    {
      Addition a=new Addition();
      int x=a.add(2,3);
      int y=a.add(2,3,4);
      double z=a.add(2.5,4.6);
      System.out.println(x+" "+y+" "+z);
    }
  }