package SwitchWhilePractice;

public class Triangle{
    public static void main(String[] args) {
        int i=1;
        while(i<=3){//行数3行
            int j=1;
            while(j<=3-i){//画的点数此处有疑惑：j执行++之后变成2，之后继续执行k，那么再回来再次执行的时候，j是多少？
                System.out.print(".");
                j++;
            }
            int k=1;
            while(k<=2*i-1){//画的星星
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }

    }
}


/*..*     i=1  2 1
.***    i=2  1 3
*****   i=3  0 5

点数3-i
星星数2*i-1
*/
