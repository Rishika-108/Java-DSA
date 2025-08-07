package FundamentalOfJava;
class  Pen {
    String colour;
    String type;

    public void write () {
        System.out.println( "Writing something");
    }

    public void PrintColour () {
        System.out.println (this.colour);
    }
}
//Polymorphism - Can create different fucntions with same function name [return type or argument type is the differentiator]
//Inheritance - Can take values from parent class. Use extends keyword

public class OOPS {
        public static void main(String[] args) {
            Pen p = new Pen();
            p.colour =  "blue";
            p.type =  "gel";

            Pen p2 = new Pen ();
            p2.colour =  "black";
            p2.type =  "ball";

            p.write();
            p.PrintColour ();
            p2.PrintColour ();

        }
    }
