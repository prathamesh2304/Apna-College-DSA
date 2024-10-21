package Day8;

public class BinarySearch {
    public static int binSearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) { // Check value at mid
                return mid;
            }
            if (numbers[mid] > key) { // Compare value at mid with key
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;  
    }
        
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int key = 10;
        System.out.println("The Number Is At Index: " + binSearch(numbers, key));
    }
}
