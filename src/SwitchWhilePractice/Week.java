package SwitchWhilePractice;

import java.util.Scanner;

public class Week{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        switch(value){
            case 1:
            case 3:
            case 5:
                System.out.println("学语文");break;
            case 2:
            case 4:
            case 6:
                System.out.println("学数学");break;
            case 7:
                System.out.println("休息");break;
            default:
                System.out.println("不好意思请重新输入");break;
        }


    }
}
