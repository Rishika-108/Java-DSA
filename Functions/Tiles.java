package Functions;

public class Tiles {
    public static int tiles (int n, int m) {
        if (n == m) { //With allow either horizontal or vertical and never both
            return 2;
        }
        if (n < m) { // Will allow only horizontal placements
            return 1;
        }
        //place vertically
        int vertical = tiles(n-1, m);

        //horizontally
        int horizontal = tiles(n-m, m);

        return vertical + horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tiles(4, 2));
    }
}
