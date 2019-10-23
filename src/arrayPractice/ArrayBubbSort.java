package arrayPractice;

public class ArrayBubbSort {
        public static void main(String[] args) {
		/*数组排序
		降序排序
		a{4,5,1,3,2}；
		每个数组和上一个进行比较，如果比上一个大就互换
		排列的本质就是元素交换
		*/
            int[] array = {3,2,4,1,5};
            for (int j=1;j<5 ;j++ ) {//控制循环继续，一个数对比完之后对比下一个

                for (int i=4;i>=j ;i-- ) {//每一次从下向上对比，发现比上一个大就互换
                    if (array[i]>array[i-1]) {
                        int x =array[i];
                        array[i]=array[i-1];
                        array[i-1] = x;
                    }
                }
            }
            for (int v :array ) {
                System.out.print(v);
            }

        }
//冒泡排序
}
