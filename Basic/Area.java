import java.util.*;

public class Area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Object Creation
            float rad = sc.nextFloat(); // Using nextFloat() input of float is taken
            float area = 3.14f*rad*rad;
            System.out.println(area);
        }

    }
}
