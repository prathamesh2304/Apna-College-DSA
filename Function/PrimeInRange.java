package Day6;
        
public class PrimeInRange {

    public static boolean isPrimeXP(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
           if(n % i == 0){         
               return false;
                         }
                           }
            return true;
}

    public static void PrimeInRangem(int n){
        for(int i=2;i<=n;i++){
           if(isPrimeXP(n)){
            System.out.print(" "+i);
           }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        PrimeInRangem(5);
    }
}
