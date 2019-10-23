package ifPractice;

import java.util.Scanner;

public class Season {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input");
        int day = input.nextInt();

        if(day<1 || day>12){
            System.out.println ("unknow");
        }else if(day >= 6 && day <= 8){
            System.out.println("summer");
        }else if (day >= 9 && day <= 11) {
            System.out.println("qiutian");
        }else if(day >=3 && day<=5){
            System.out.println("chuntian");
        }else{
            System.out.println ("dongtian");
        }


    }
}
