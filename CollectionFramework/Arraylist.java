
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
  public static void main ( String args[]) {
    ArrayList <Integer > list = new ArrayList<Integer>();
    // ArrayList <String > list2 = new ArrayList <String >();
    // ArrayList <Boolean> list3 = new ArrayList <Boolean> ();

    // add elements
    list.add (0);
    list.add (2);
    list.add (3);
    System.out.println(list);

    //get elements
    int elements = list.get(2);
    System.out.println(elements);

    //add element in between
    list.add(1, 1);
    System.out.println(list);

    //set element
    list.set(0, 5);
    System.out.println(list);

    //delete element
    list.remove(3);
    System.out.println(list);

    //size 
    int size = list.size();
    System.out.println(size);

    //Sorting
    Collections.sort (list);

    //loop
    for (int i = 0; i <list.size() - 1; i++) {
      System.out.println( (list.get(i)));
    }
    System.out.println();
  }
}