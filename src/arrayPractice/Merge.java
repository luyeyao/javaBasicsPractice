package arrayPractice;

public class Merge {
    public static void main(String[] args) {
        //思路一
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        int[] c = new int[a.length + b.length]; //创建一个新空数组，填到里面
        for (int i = 0; i < a.length; i++) { //a数组的放进去
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) { //b数组的放进去，b数组的开始下标，在c这个新数组里，已经变成了3
            c[a.length + i] = b[i];
        }
        for (int v : c) {
            System.out.print(v);
        }

        //思路二
		/*int[] a={1,2,3};
		int[] b={4,5};
		int[] newArray = new int[5];
		for (int i=0;i<newArray.length ;i++ ) {
			//如果新数组下标和a的下标一致，则输入，否则就是b的下标一致，也继续
			if (i<=a[i]) {
				newArray[i] = a[i];
			}else{
				newArray[i-a.length] = b[i];
			}
			//在输出
		}
		*/
    }
}