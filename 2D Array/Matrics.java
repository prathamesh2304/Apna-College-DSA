import java.util.*;

public class Matrics{

    public static boolean search(int matrics[][], int key){
        for(int i=0; i<matrics.length; i++){
                for(int j=0; j<matrics[0].length; j++){
                    if(matrics[i][j] == key){
                        System.out.print("Your Key ("+key+") Found at cell ("+i+","+j+")");
                        return true;
                    }
                }
            }
            System.out.println("Key not Found");
            return false;
    }


    public static void main(String args[]){
        int matrics[][] = new int[3][3];
        int n = matrics.length;/*this give rows of 2D Array*/
        int m = matrics[0].length;/*this give column of 2D Array*/

        Scanner sc = new Scanner(System.in);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrics[i][j] = sc.nextInt();
                }
            }

            
            // Output
            System.out.print("2D Array is");
            System.out.println();
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    
                    System.out.print(matrics[i][j]+" ");
                }
                System.out.println();
            }
            search(matrics,5);
    }
}