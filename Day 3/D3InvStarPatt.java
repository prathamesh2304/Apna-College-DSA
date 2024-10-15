import java.util.*;
public class D3InvStarPatt {
    /* ***** Outter Loop = number of lines which is 4
     * ****  Inner Loop = relation -> 1 Line gives 4 Stars ; 2nd gives 3 Stars 
     * ***
     * **
     */
    public static void main(String[] args) {
        int n;
       try (Scanner sc = new Scanner(System.in)) {
        n = sc.nextInt();
    }
       for( int line = 1; line <= n; line++){
            for( int star = 1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
