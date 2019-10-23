package forPractice;

public class Foot {
    public static void main(String[] args) {

        for (int chook = 1;chook <= 50 ;chook++ ) {
            int rabbit = 50 - chook;
            if (rabbit*4 + chook*2 == 160) {
                System.out.println(rabbit);
                System.out.println(chook);

                break;
            }
        }


    }
}

