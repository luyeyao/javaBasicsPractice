package forPractice;

public class Count{
    public static void main(String[] args){
        int a;
        int b;
        int c;
        int d;

        for (int x=1 ;x<370 ; x++) {

            a = x-10;
            b = x+20;
            c = x/2;
            d = x*2;

            if (a + b + c + d == 370) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                break;
            }

        }

    }
}
