package arrayPractice;
import java.util.Scanner;

public class ArrayLogin {
        public static void main(String[] args) {
            String[][] tarrray = {{"郑中拓","123"},{"渡一教育","222"},{"java","333"}};
		/*循环查找用户名密码，用户名和密码的下标应相同
		如果用户名准确，则继续查找密码，如果密码准确，登录成功
		如果密码不准确，登录失败，回复用户名或密码错误
		如果用户名不存在，回复用户名或密码错误
		*/
            boolean b =false;
            Scanner input = new Scanner(System.in);
            String uname = input.nextLine();
            String upwd = input.nextLine();

            for (int i=0;i<3 ;i++ ) {

                for (int j=0;j<2 ;) {
                    if (tarrray[i][j].equals(uname)) {
                        j++;
                        if (tarrray[i][j].equals(upwd)) {
                            b =true;
                            System.out.println("login successful");
                        }

                        break;
                    }
                }
            }
            if (!b) {
                System.out.println("username or pwd error");
            }



        }

}
