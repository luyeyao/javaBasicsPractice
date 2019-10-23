package forPractice;

public class SplitDigit {
        public static void main(String[] args) {
            for (int a = 100;a<=999 ;a++ ){
                if( Math.pow (a/100,3) + Math.pow(a%100/10,3) + Math.pow (a%10,3) == a) {
                    System.out.println(a);
                }

            }



        }

}
