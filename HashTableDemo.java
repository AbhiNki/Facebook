package com.facebook.toptenfreshers;
import java.util.*;
class HashTabledemo      
{
    public static void main(String[] arg)
    {

        Hashtable<Integer, String> h = new Hashtable<>();
        
        //Hashtable<Integer, String> h1 = new Hashtable<>();
          
        h.put(3, "Geeks");
        h.put(2, "forGeeks");
        h.put(1, "isBest");
          
        // create a clone or shallow copy of hash table h
     
          
        // checking clone h1
        System.out.println("values in clone: " + h);
          
        // clear hash table h
        h.clear();
          
        // checking hash table h
        System.out.println("after clearing: " + h);    
      }
}

