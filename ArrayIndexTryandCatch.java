//Array Index Out of Bond using Try and Catch 

class ArrayIndexTryandCatch
  {
    public static void main(String args[])
    {
      int [] arr={1,2,3,4};

      try
        {
          System.out.println(arr[6]);
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("ArrayIndexException");
    }
  }