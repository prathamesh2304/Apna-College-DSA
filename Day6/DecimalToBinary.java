package Day6;

public class DecimalToBinary { // Dec 5 = Bin => 2/5 

    
    public static void DecToBin(int n){
        int POW=0;
        int myNum = n; 
        int BinNum = 0;
             
            while (n > 0) {
                int rem = n % 2; // Remainder Is Geting Nothing But A Single Digit Of Binary
                BinNum = BinNum + (rem * (int)Math.pow(10, POW));
                POW++;
                n = n/2; // Number Cut 
            }
            System.out.printf(" "+myNum+" Is Converted Into  "+BinNum);
    }
    
    public static void main(String[] args) {
        DecToBin(5);
    }
}
