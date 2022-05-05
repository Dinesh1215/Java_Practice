//Map Interface sample program

import java.util.*;
  class Map_Interfaces
    {
      public static void main(String args[])
      {
        HashMap<Integer,String>map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Orange");
        map.put(3,"PineApple");

        System.out.println(map);
      }
    }