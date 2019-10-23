package forPractice;

public class Demo{
    public static void main(String[] args) {
        int a; //羽毛球拍
        int b;//球
        int c; //水
        int number = 0;

        for (a=1;a<=13 ;a++ ) {
            //
            for (b=1;b<=66 ;b++ ) {
                //
                for (c=1;c<=100 ;c++ ) {

                    if (a*15+b*3+c*2==200) {
                        //System.out.print(a+" ");
                        //System.out.print(b+" ");
                        //System.out.print(c+" ");
                        //System.out.println();
                        number++;
                    }
                }


            }
        }System.out.println(number);



    }
}

//羽毛球拍15元，球3元，水2元。200元每种至少一个，最多各买多少

//羽毛球拍最多买13个 球最多买66个 水最多买100个
