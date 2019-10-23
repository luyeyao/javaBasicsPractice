package arrayPractice;

public class ArrayPrime {
    public static void main(String[] args) {

        //思路一 循环一次得出数组长度，创建一个较长的新数组将素数放入，再将新数组的默认值0去掉

        int v = 0; //num的个数
        int[] primeArray = new int[50];  //需要放值的新数组
        for (int num=2;num<100 ;num++ ) {//除数
            boolean sign = false;
            for (int ber=2;ber<=num-1 ;ber++ ) {//被除数
                if (num%ber==0) {
                    sign = true;
                    break;
                }
            }
            if (sign==false) {
                primeArray[v] = num;
                v++;

            }
        }
        int[] newArray = new int[v];  //创建一个新数组，长度为v的值，即素数的个数
        for (int i=0;i<newArray.length ;i++ ) {
            newArray[i] = primeArray[i];
        }
        primeArray = null;

        for (int finall :newArray ) {
            System.out.print(finall);
        }



        //思路二  循环两次，第一次找出数组长度，第二次将素数放入数组
        //1.创建一个数组
        //2.在2-100之间循环，只能被1和他本身整除的就是质数，
        //如果除以其他数余数不为0，就不是质数


/*
		int v = 0;

		for (int num=2;num<=100 ;num++ ) {//除数
			boolean x =false;
			for (int i=2;i<=num-1 ; i++) {//被除数
				if (num%i==0) {
					x = true;
					break;
				}
			}

			if (x == false) {
				//System.out.println(num);
				v++;
			}
		}
		System.out.println(v);
		//3.创建数组，再次找寻素数放入
		int[] y = new int[v];
		int index = 0;    //一个新变量，记录数组索引变化
		for (int num=2;num<=100 ;num++ ) {//除数
			boolean x =false;
			for (int i=2;i<=num-1 ; i++) {//被除数
				if (num%i==0) {
					x = true;
					break;
				}
			}

			if (x == false) {

				y[index] = num;
				index++;
			}
		}
		for (int h :y ) {
			System.out.print(h+" ");
		}

*/



    }
}
