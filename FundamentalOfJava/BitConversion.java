package FundamentalOfJava;

public class BitConversion {
    public static void main(String[] args) {
        String binary =  "10001";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        int decimal2 = 34;
        String binary2 = Integer.toBinaryString(decimal2);
        System.out.println(binary2);
    }
}
