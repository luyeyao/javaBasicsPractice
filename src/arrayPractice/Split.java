package arrayPractice;

public class Split {
        public static void main(String[] args) {
            int[] array ={1,2,3,4,7,9,7,4,5,9,3,5};
            int max = array[0];
            int[] n = new int[array.length];
            int m=0;
            for (int i=1;i<array.length ;i++ ) {
                if (max<array[i]) {
                    max = array[i];
                    n = new int[array.length]; //重新定义n，将n的内容更新
                    n[0] = i;
                    m = 0;                   //m是n的下标，重新定义
                }else if (max == array[i]) {
                    m++;               //进入elseif循环时m++来确定n的下标到几
                    n[m]=i;
                }
                //这一段是为了，当数组中，有好几个最大值的时候，如何判断最大值的位置

            }
            int[] n0 = new int[m+1];
            //一个新的数组，将n数组的值放入，但n数组的值有0，所以仅取m+1个有效位
            for (int y=0;y<=m ;y++ ) {
                n0[y] = n[y];
            }
            for (int v :n0 ) {
                System.out.print(v);
            }

		/*int[] a = new int[n];
		int[] b = new int[array.length-n-1];
		for (int i=0;i<array.length ;i++ ) {
			if (i<n) {
				a[i] = array[i];
			}else if (i>n) {
				b[i-n-1] = array[i];
			}
		}
		for (int v :a ) {
			System.out.print(v);
		}
		System.out.println("\n------------------------");
		for (int v :b ) {
			System.out.print(v);
		}
	*/



        }

}
