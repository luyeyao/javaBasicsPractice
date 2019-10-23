package forPractice;

public class PaintHeart {
        public static void main(String[] args) {
            for (int i=1;i<= 9;i++ ) {
                //行数
                for (int j=1;j<=i ;j++ ) {
                    System.out.print(j +"*"+ i + "=" + j*i + "\t");

                }
                System.out.println();
            }
        }
//1*1=1
//1*2=2 2*2=4   乘法表

}
