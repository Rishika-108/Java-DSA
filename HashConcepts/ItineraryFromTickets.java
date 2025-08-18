package HashConcepts;

import java.util.HashMap;

public class ItineraryFromTickets {
    public static   String getStart (HashMap <String, String> tick) {
          HashMap <String, String> revMap = new HashMap<>();
          for (String key : tick.keySet()) { // reverse the map
            revMap.put(tick.get(key), key); // store destination as key and source as value
          }
          for (String key : tick.keySet()) { // find the starting point
            // if the source is not present in the destination map, it is the starting point
            if ( !revMap.containsKey(key)) { // i.e., if the source is not a destination
                return key;// return the starting point
            }
          }
          return null;
    }
    public static void main(String[] args) {
        HashMap  <String, String > tickets = new HashMap<>();
        tickets.put( "Chennai",  "Bengaluru");
        tickets.put(  "Mumbai",  "Delhi");
        tickets.put( "Goa",  "Chennai");
        tickets.put( "Delhi",  "Goa");

        String start = getStart(tickets); // get the starting point
        while (tickets.containsKey(start)) { // iterate through the tickets
            System.out.print(start +  "->"); // print the itinerary
            start = tickets.get(start);// get the next destination
        }
        System.out.println(start);
    }
}
