package Day6;

public class BinaryToDecimal {

    public static void BinToDec(int BinNum){  // n=101 
        // 101 = (1)x(2)*2+(0)x(2)*1+(1)x(2)*0 = 4+1=5 
        int Dec = 0; 
        int myNum = BinNum;
        int POW = 0;
        while (BinNum > 0) {
            int lastDigit = BinNum % 10;
            Dec = Dec + (lastDigit * (int)Math.pow(2, POW));
            POW++;
            BinNum = BinNum / 10;
        }
        System.out.printf(" "+myNum+" Is Converted Into  "+Dec);
            
    }
    public static void main(String[] args) {
        BinToDec(101);
    }
    
}
