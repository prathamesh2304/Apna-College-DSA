

public class LinearSearch {
    public static int linearSearchFun(int num[],int key){
        for(int i=0; i<num.length;i++){
            if(num[i] == key){
               return i;
            }
        }
        return -1;
        }




    public static void main(String[] args) {
    int numbers[] = {1,23,25,75,88,75};
    int key = 75; 
        int index = linearSearchFun(numbers, key);
        if(index == -1){
            System.out.println("Key NOT FOUND");
        } else{
            System.out.println("Key Is at index "+index);
        }
    
    }
}
