import java.util.*;

public class BasicSorting{
    public static void bubbleSort(int arr[]){
        for(int turn=0 ; turn < arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        // System.out.println();
    }

    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){ 
            int minElementPos = i; // it is the minimum elements position in whole array
            for(int j=i+1; j<arr.length; j++){
                if(arr[minElementPos] < arr[j]){ // less than or greater than as you wish
                    minElementPos = j; // here is checking of whole array and if there is any element is there the new position is assigment to it 
                }
            }
            // swap
            int temp = arr[minElementPos];
            arr[minElementPos] = arr[i];
            arr[i] = temp;
        }
    }

    // [5,3,6,4,7,2,1]
     // 0 1 2 3 4 5 6
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){ // for i=1
            int curr = arr[i]; // will provies us element // arr[1]=3 
            int prev = i-1; // will provide index // prev = 0th index
            // finding our correct position to insert 
            while(prev >= 0 && arr[prev] > curr){ // 0(T) && arr[0]=5 > 3(T)  
                arr[prev+1] = arr[prev]; // (arr[1]=(3)) = arr[0]=(5) // 3<-5 // prev=1
                prev--;// prev=0 // reset
            }
            // insertion
            arr[prev+1] = curr; // curr = 3 
        }
    }

    // Time Complexity of Bubble Sort is O(n^2) and Space Complexity is O(1)
    // Time Complexity of Selection Sort is O(n^2) and Space Complexity is O(1)
    // Both are not the best sorting algorithm but they are the basic sorting algorithm

    

    public static void main(String arg[]){
        int arr[] = {5,3,6,4,7,2,1};
        System.out.println("Unsorted Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Sorted Array Using Bubble Sort");
        printArr(arr);
        System.out.println();
        selectionSort(arr);
        System.out.println("Sorted Array Using Selection Sort");
        printArr(arr);
        System.out.println();
        insertionSort(arr);
        System.out.println("Sorted Array Using Insertion Sort");
        printArr(arr);

    }

}