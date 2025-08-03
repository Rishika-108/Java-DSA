package FundamentalOfJava;

// Left Shift - N  << i
// Right Shift - N  >> i

public class BitManipulation {
    public static void main(String[] args) {
    //1. Get the 3rd bit (position = 2) of a number n. (n = 0101)
    int n = 5; //0101
    int pos = 2;
    int bitMask = 1<<pos;

    if ((bitMask  & n) == 0 )  {
        System.out.println( "Bit was zero");
    } else  {
        System.out.println( "Bit was 1");
    }
    //2. Set the 2nd bit (position = 1) of a number n. (n = 0101)
    int n2 = 5;
    int pos2 = 1;
    int bitMask2 = 1  << pos2;

    int newNumber = bitMask2  | n2 ;
    System.out.println(newNumber);

    //3.Clear the 3rd bit (position = 2) of a number n. (n=0101)
    int n3 = 5;
    int pos3 = 2;
    int bitMask3 = 1  << pos3;
    int notbitMask =  ~bitMask3;

    int newNumber2 = notbitMask & n3;
    System.out.println(newNumber2);

    //4.Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
    int n4 = 5;
    int pos4 = 1;
    int bitMask4 = 1 << pos4;
    int oper = 0;
    if (oper == 1) { //Set Operation
        int newNumber3 = bitMask4 | n4;
        System.out.println(newNumber3);

    } else if (oper == 0) { //Clear Operation
        int notbitMask2 =  ~bitMask4;
        int newNumber3 = notbitMask2  & n4;
        System.out.println(newNumber3);
    } else  {
        System.out.println( "Invalid");
    }

}
}


