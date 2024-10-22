

public class Largest {
    public static int getLargest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE; // - infinity
        
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){

                // if(numbers[i]<largest){ // number = 77 & largest initailly hold value -00 now if 77<
                    largest = numbers[i];
            }
                if(smallest > numbers[i]){
                    // if(numbers[i] > smallest){
                        
                    System.out.print("The smallest number is = " +smallest);
                    
                }
            }
            
        
        return largest;
    }
        public static void main(String[] args) {
        int numbers[] = {1,3,5,77,8};
        System.out.println("The Largest Number is "+getLargest(numbers)); 

        }
    }

