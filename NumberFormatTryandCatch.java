// Number Format Exception using Try and Catch method

class NumberFormatTryandCatch
  {
    public static void main(String args[])
    {
      String str="123";     //space can give or not   we can't convert space to int
      int a=Integer.parseInt(str);   //using parse method we can convert string to int

      try
        {
          System.out.println(a);
        }
      catch(ArithmeticException e)
        {
          System.out.println(e);
        }
      System.out.println("Exception Handled");
    }
  }