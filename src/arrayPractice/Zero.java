package arrayPractice;

public class Zero{
    public static void main(String[] args) {
        //0.数组a
        int[] a = {1,2,3,0,0,4,5,0,6,0,7,};

        //如何确定b的长度
        //1.找寻a数组中0元素的个数
        int m=0;
        for (int i=0;i<a.length ;i++ ) {
            if (a[i]!=0) {
                m++;
            }
        }
        System.out.println("新数组长度"+m);
        //2.创建一个新的空数组b
        int[] b = new int[m];
        //3.将a中的非0元素给b
        int index = 0;
        for (int i=0;i<a.length ;i++ ) {
            if (a[i]!=0) {
                //4.如何确定在a的下标变化时，b的下标为几？自己定义
                b[index]=a[i];
                index++;
            }
        }
        for (int v :b ) {
            System.out.print(v);
        }
    }
}
