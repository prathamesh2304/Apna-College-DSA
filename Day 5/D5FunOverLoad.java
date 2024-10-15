public class D5FunOverLoad {
    public static int Multiply(int a, int b){
        return a*b;
    }
    public static int Multiply(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        System.out.println(Multiply(12, 32));
        System.out.println(Multiply(6, 32,2));
    }
}
