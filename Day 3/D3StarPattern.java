public class D3StarPattern {
        /* *
         * **
         * ***
         * ****
         * ***** */
    public static void main(String[] args) {
        for ( int line=0 ; line <= 4; line++){
            for ( int star = 0; star <= line; star++ ){
                    System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
