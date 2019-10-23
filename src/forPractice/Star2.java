package forPractice;
import java.util.Scanner;
public class Star2 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();


            for (int i=1; i<= number;i++ ) {//确定总共多少行
                for (int j=1;j<= 2*i-1 ;j++ ) {//判断前几位数一直到中间位
                    if (j < i) {

                        System.out.print(j);
                    }else{//向后减的位数

                        System.out.print(2*i-j);
                    }
                }

                System.out.println();
            }

        }


//***1***    i=1  3 1 3   line+1-i
//**121**    i=2  2 3 2
//            *12321*    i=3  1 5 1
}
