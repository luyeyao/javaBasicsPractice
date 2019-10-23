package forPractice;

public class Prime {
        public static void main(String[] args) {
            //除以1和它本身可以除
            //除以1到它本身中间的任意数字都不能除开

            for (int num =2;num<=100 ;num++ ) {


                //i在for循环中，循环结束即不能用，因此需要把i提前定义
                boolean x =false; //用其他如int=1，if中int=1来判断也可以，但是boolean占空间小
                //boolean为标识，如一条新裤子
                for (int i=2;i<=num-1 ;i++ ) {//num-1是为了不除以它本身.i从2开始是为了不除以1

                    //但此处可以优化，i<=num/2,i<=num的平方根
                    if (num%i == 0) {
                        System.out.println(num +"不是素数");
                        x = true;
                        break;
                    }
                }
                if (!x) {
                    //x==false相当于！x，就是x里的值false和false对比，是true，所以！x也就是true
                    //如果x本身=true，就直接写if（x）
                    System.out.println(num +"是素数");
                }
            }

        }
/*1-100不好考虑，可以想想另一个问题，9是不是素数
int num = 9;
i的循环在2-8之间，9除以i取余数
*/
}
