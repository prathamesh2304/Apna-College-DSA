public class D4FuctionMethod {

    public static void Pf(){
        System.out.println("Hello World");
    }
    
    public static int Sum(int i,int j){ // Formal Parameter
        int sum = i + j;
        return sum;
    }
    public static int Multiply(int i,int j){ // Formal Parameter
        int Multiply = i * j;
        return Multiply;
    }

    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        
    }

    public static int Factorial(int n){
        int F=1;
        for(int i=1;i<=n;i++){
            F*=i;
        }
       return F;
    }
    
    public static int BinCoeff(int n,int r){
        int fac_n = Factorial(n);
        int fac_r = Factorial(r);
        int fac_nmr = Factorial(n-r);
        
        int BinCoeff = (fac_n)/(fac_r)*(fac_nmr);
        return BinCoeff;
    }
    public static void main(String[] args) {
        Pf();
        int a = 10;
        int b = 5;
        System.err.println("Sum Is " +Sum(a,b));// Actual Parameter
        System.err.println("Multiply Is " +Multiply(a,b));// Actual Parameter
        swap(a,b);
        int n=7;
        int r=3;
        System.out.println(Factorial(n));
        System.out.println(BinCoeff(n, r));
        
    }
}
