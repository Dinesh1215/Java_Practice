//find the areas of the rectangle, square, triangle, circle   Polymorphism

import java.util.Scanner;
class Area
  {
    int add(int l,int j)    //area of rectangle
    {
      return(l*j);
    }
    int add(int s)         // area of square
    {
      return(s*s);
    }
    double add(double d,double h)     //area of triangle
    {
      return(1/2*d*h);
    }
    double add(double r)        //area of circle
    {
      return(3.14*r*r);
    }
  }
class Areas
  {
    public static void main(String args[])
    {
      Area a=new Area();
      int w=a.add(3,5);
      int x=a.add(6);
      double y=a.add(3,6);
      double z=a.add(2);

      System.out.println(w+" "+x+" "+y+" "+z);
    }
  }