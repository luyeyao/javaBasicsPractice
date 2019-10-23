package SwitchWhilePractice;

import java.util.Scanner;

public class Dapo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        switch(score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("bujige");break;
            case 6:
                System.out.println("jige");break;
            case 7:
                System.out.println("zhogndeng");break;
            case 8:
                System.out.println("lianghao");break;
            case 9:
                System.out.println("youxiu");break;
            case 10:
                if (score ==100) {
                    System.out.println("manfen");break;
                }
            default:
                System.out.println("cuowu");break;
        }


    }
}
