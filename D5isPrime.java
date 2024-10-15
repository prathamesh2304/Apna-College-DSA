public class D5isPrime {
    public static boolean isPrime(int n){
        if(n==2){ // Corner Case
            return true;
        }
        boolean isPrime = true;
             for(int i=2; i<=n-1;i++){
                if(n % i == 0){         
                    isPrime = false;
                                }
                                     }
                 return isPrime;
    }
    public static boolean isPrimeG8(int n){
             for(int i=2; i<=n-1;i++){
                if(n % i == 0){         
                    return false;
                              }
                                }
                 return true;
    }
    public static boolean isPrimeXP(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
           if(n % i == 0){         
               return false;
                         }
                           }
            return true;
}

    public static void main(String[] args) {
        System.out.println(isPrimeXP(10));
    }
}
