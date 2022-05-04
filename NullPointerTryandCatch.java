//Null Pointer Exception using Try and Catch

class NullPointerTryandCatch
  {
    public static void main(String args[])
    {
      String str=null;
      

      try
        {
          System.out.println("str.length");
        }
      catch(NullPointerException e)
        {
          System.out.println(e);
        }
      System.out.println("Exception Handled");
    }
  }