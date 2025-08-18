package HashConcepts;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet <Integer > set = new HashSet <>();
        // Set doesnt allow duplicate elements

        //Add an element
        set.add (1);
        set.add (2);
        set.add (3);
        set.add (4);

        // Search an elements
        if (set.contains (1)) {
            System.out.println( "Present in set");
        } else {
            System.out.println( "Not present");
        }

        //Delete an element
        set.remove (1);
        if ( !set.contains (1)) {
            System.out.println( "Does not contain 1");
        }
        //Size of set
        System.out.println( "Size : " +  set.size());
        System.out.println(set);

        //Iterator - Used to transverse across the set
        Iterator <Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
