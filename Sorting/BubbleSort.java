import java.util.*;

public class BubbleSort{
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

    public static void main(String arg[]){
        int arr[] = {5,3,6,4,7,2,1};
        System.out.println("Unsorted Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Sorted Array");
        printArr(arr);
    }

}