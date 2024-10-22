public class PairOfArray {
    
    public static void printPair(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length;i++){ // Entering For 2
           int curr = numbers[i]; // 2,4,6,8,10
           
            for(int j=i+1;/*nextdig*/j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair = "+tp);
    }
    
    
    
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};   
        printPair(numbers); 
    }
    
}
