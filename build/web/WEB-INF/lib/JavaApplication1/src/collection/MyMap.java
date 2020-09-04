/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author pc
 */
public class MyMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
//        put methods
        hashMap.put(1, "rchi rich");
        hashMap.put(3, "kala hiran");
        Object o=hashMap.put(2, "ball doll");
        System.out.println(o);
        hashMap.put(4, "tom and carry");
        hashMap.put(5, "my love");
        
        System.out.println(hashMap);
        o=hashMap.put(1,"changed value");
        System.out.println(o);
        System.out.println(hashMap);
        
//        remove methods

          hashMap.remove(3);
          System.out.println(hashMap);
          
//          get method
          System.out.println(hashMap.get(5));
          
//          containsKey method

         System.out.println(hashMap.containsKey(5));
         System.out.println(hashMap.containsKey(6));
         
//         containsValue method

         System.out.println(hashMap.containsValue("my love"));
         System.out.println(hashMap.containsValue(" aaaaa "));
         
//         keySet method

         Set<Integer> set =hashMap.keySet();
         
         System.out.println(set);
         
//         entrySet

          Set <Entry<Integer, String>> set1 =hashMap.entrySet();
          
          System.out.println(set1);
          
//          iterators 
       
           Iterator<Entry<Integer,String>> iterator = set1.iterator();
           
           while(iterator.hasNext()){
                 Entry<Integer,String> e = iterator.next();
                 
                 System.out.println(e.getKey()+ " "+ e.getValue());
                 
                 if(e.getKey().equals(5)){
                     hashMap.put(e.getKey(),"kittu beta");
                 }
                 
           
           }
           
           System.out.println(hashMap);
           
           System.out.println("LinkedHashMap ...............");
           
//           LinkedHashMap 

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        
//        put methods
        linkedHashMap.put(1, "rchi rich");
        linkedHashMap.put(3, "kala hiran");
        Object o1=linkedHashMap.put(2, "ball doll");
        System.out.println(o1);
        linkedHashMap.put(4, "tom and carry");
        linkedHashMap.put(5, "my love");
        
        System.out.println(linkedHashMap);
    }
}
