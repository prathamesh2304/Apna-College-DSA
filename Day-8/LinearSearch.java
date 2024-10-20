package Day8;

public class LinearSearch {
    public static void linearSearch(int num[],int key){
        for(int i=0; i<num.length;i++){
            if(num[i] == key){
                System.out.println("Number is at : "+num);
            }
        }
        System.out.println("Index Not Found");
    }




    public static void main(String[] args) {
    int numbers[] = {1,23,25,75,88,75};
    int key = 75; 
    linearSearch(numbers[], key);     
    }
}
