package forPractice;

import java.util.Scanner;

public class Star1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int line = input.nextInt();

            for (int i = 1;i<= line ;i++ ) {
                if (i==1){
                    //第一行
                    for (int j=1;j<=2*line-1 ;j++ ) {
                        System.out.print("*");
                    }
                }else{
                    //画星星
                    for (int h=1;h <= line+1-i ;h++ ) {
                        System.out.print("*");
                    }

                    for (int h=1;h <= 2*i-3 ;h++ ) {
                        System.out.print(" ");
                    }

                    for (int h=1;h <= line+1-i ;h++ ) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

        }

}
