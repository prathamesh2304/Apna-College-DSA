public class ReverseOfarray {

    public static void RevArray(int Number[]){
        int start = 0; int last = Number.length-1;

        while(start < last){
            int temp = Number[last];
            Number[last]= Number[start];
            Number[start] = temp;
            start++;
            last--;
        }
    }


    public static void main(String[] args) {
     int numbers[] = {2,4,6,8,10};  
        RevArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    System.out.println();
    }
    
}
