// runtype polymorphism

import java.util.Scanner;
class Animal
  {
    void animal_sound()
    {
      System.out.println("Sounds");
    }

  }
class Cat extends Animal
  {
    void animal_sound()
    {
      System.out.println("Meow Meow");
    }
  }
class Dog extends Cat
  {
    void animal_sound()
    {
      System.out.println("Bow Bow");
    }
  }
 class Runtype
   {
     public static void main(String args[])
     {
       Cat c=new Cat();
       c.animal_sound();
     }
   }