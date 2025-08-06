package Functions;

public class Maze {
    public static int path (int i, int j, int n, int m) {
        if (i == n || j == m) { // reached the boundary of maze
            return 0; // shows no path available
        }
        if (i == n-1 && j == m-1) { 
            return 1;// shows now only one path is available
        }
        //move downwards
        int downwards = path(i+1, j, n, m); // i+1 shows increase in row, therfore movement is Downward

        //move right
        int right = path (i, j+1, n, m); // j+1 shows increase in column, therefore movement is right

        return downwards + right;
    }
    public static void main(String[] args) {
        int totalPath = path(0, 0, 3, 3);
        System.out.println(totalPath);
    }
}
