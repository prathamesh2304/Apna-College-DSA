import java.util.*;
public class D1Practice2n3 {
    public static void main(String[] args) {
  /*In a program, input the side of a square. You have to output the area of the square.
    (Hint : area of a square is (side x side)) */
          
  try (/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. 
           You have to output the total cost of the items back to the user as their bill.
      (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
      Scanner sc = new Scanner(System.in)) {
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
          float subtotal = (pencil + pen + eraser);
          float total = (subtotal) + ((subtotal)*18)/100;
           System.out.println(total);
      }


    }
}
