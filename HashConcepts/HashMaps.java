package HashConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMaps {

    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        //Insertion
        map.put( "India", 140);
        map.put( "USA", 30);
        map.put( "China", 150);
        map.put( "China", 180); // Updates the new value for The same key
        System.out.println(map);

        //Search
        if (map.containsKey( "China")) {
            System.out.println( "Present");
        } else {
            System.out.println( "Not Present");
        }

        // To find a value for a particular key
        System.out.println(map.get( "China"));
        System.out.println(map.get( "Indonesia"));

        int arr[] =  {12,15,18};
        //Second Way to Use iterator
        for (int val : arr) {
            System.out.print(val +  " ");
        }
        System.out.println();

        //Iteration in HashMaps
        for (Map.Entry <String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() +  " ");
            System.out.println(e.getValue() +  " ");
        }

        Set <String> keys = map.keySet();
          for (String key : keys) {
            System.out.println(key + " " + map.get(key));
          }

        //To Remove
        map.remove ( "China");
        System.out.println(map);  
    }
}