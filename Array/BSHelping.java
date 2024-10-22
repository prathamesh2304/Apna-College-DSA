

public class BSHelping {
    
    /*  package Day8;

    public class BinarySearch {
        public static int binSearch(int numbers[],int key){
            
            int start = 0, end = numbers.length - 1;
            int mid = (start + end)/2; 
            
                                        // {2,4,6,8,10,12}; key = 10
                                        //  ^ ^ ^ ^  ^  ^
             while(start <= end){       //  s ^ ^ ^  ^  e
                                        //  s ^ ^ m  ^  e
                if(numbers[mid] == key ){
                    return mid;
                } 
                if(numbers[mid] > key){          //  s ^ ^ m ^ ^ ^    key = 10 right
                                        //    (m=1) s ^ e    right
                    start = mid+1;      //      ^ 
                }else{                  //  s ^ e (m-1)      eft
                    end = mid-1;
                }
            }
            return -1;  
        }
            
        public static void main(String[] args) {
            int numbers[] = {2,4,6,8,10,12};
            int key = 10;
            System.out.println("The Number Is At Index: "+binSearch(numbers, key));
        }
        
    }
*/    
}
