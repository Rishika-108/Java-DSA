package Functions;

public class TowerOfHanoi {
    public static void tower (int n, String src, String help,String dest) {
        if (n == 1) {
            System.out.println( "Transfer Disk" + n +  " from " + src +  " to " + dest);
            return;
        }

         tower (n-1, src, dest, help);
         System.out.println ( "Transfer Disk" + n +  " from " + src +  " to " + dest);

         tower(n-1, help, src, dest);

         
    }
    public static void main (String args[]) {
        // 1. n disks in Source tower
        // 2. 1 disk can be transfered from source tower to destination tower
        // 3. (n-1) disks to be tranfered from helper to destination using using source as helper.
        
        tower (2,  "S",  "H",  "D");
    }
}