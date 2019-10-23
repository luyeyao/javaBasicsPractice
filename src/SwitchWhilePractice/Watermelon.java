package SwitchWhilePractice;

public class Watermelon{
    public static void main(String[] args) {
        int num=1020;
        int a =0;
        int day=0;
        while(a<1020){
            a+=num/2+2;
            day++;
            num=1020-a;
            System.out.println("经过了"+day+"天"+num);
        }System.out.println(day+"天卖完了");
    }
}



/*总共1020个西瓜
每天卖掉总数一半  多两个
多少天卖完

num=1020
num/2-2
*/
