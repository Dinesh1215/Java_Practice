// Single Inheritance

import java.util.Scanner;
class Animal
  {
    string colour;
    void eat()
    {
      System.out.println("Eating");
      
    }
  }
class Dog extends Animal
  {
    string bread;
    void bark()
    {
      System.out.println(" Dog is Barking");
    }
  }

class SingleInheritance
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.colour="Brown";
      d.bread="BullDog";
      System.out.println(colour+" "+bread);

      d.eat();
      d.bark();
    }
  }