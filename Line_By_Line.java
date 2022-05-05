// map interface to print inputs line by line

import java.util.*;
class Line_By_Line
  {
    public static void main(String args[])
    {
      HashMap<Integer,String>map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Orange");
        map.put(3,"PineApple");

      for(Map.Entry m:map.entrySet())
        {
          System.out.println(m.getKey()+" "+m.getValue());
        }
    }
  }