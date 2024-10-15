import java.util.*;
public class D1Practice1 {
    /*In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
     (Hint : Average of N numbers is sum of those numbers divided by N)*/
     public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          double avg = (a+b+c)/3;
          System.out.println(avg);
    }

     }
}
