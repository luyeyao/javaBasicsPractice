package forPractice;

import java.util.Scanner;

public class Star4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int star = input.nextInt();

        //固定行数4行
        for (int i=1;i<=star ;i++ ) {
            //第一步占位符
            for (int j=1;j<=star-i ;j++ ) {
                System.out.print(" ");
            }
            //第二步左边的数字
            for (int j=1;j<=i ;j++ ) {
                System.out.print(j);
            }
            //第三步右边的数字
            for (int j=i-1;j>=1 ;j-- ) {
                System.out.print(j);
            }
            //第四步换行
            System.out.println();

        }

    }
}


/*               占位符   左边的数字   右边的数字
   1	  i=1     3       1              0
  121     i=2     2       1-2            1
 12321    i=3     1       1-3            2-1
1234321   i=4     0       1-4            3-1
*/
