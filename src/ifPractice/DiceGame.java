package ifPractice;

import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dice = input.nextLine();


        double v = Math.random();
        int number = (int)(v*6)+1;
        System.out.println(number);



        if (number <= 3 && dice.equals("xiao")) {
            System.out.println("duile,xiao");
        }else if (number >3 || number <=6 && dice.equals("xiao")){
            System.out.println("duile,da");
        }else{
            System.out.println("cuole");
        }

//掷骰子练习

    }
}
