package practice.part2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am your calculator!");
        System.out.println("Input number 1: ");
        short number1 = scanner.nextShort();
        System.out.println("Input number 2: ");
        short number2 = scanner.nextShort();
        System.out.println("Great! Input number from menu: ");
        System.out.println("1 - sum");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        try {
            byte input = scanner.nextByte();
            float res = 0;
               if(input == 1) {
                  res = number1 + number2;
                   System.out.println("Result = " + res);
               } else if (input == 2) {
                   res = number1 - number2;
                   System.out.println("Result = " + res);
               } else if (input == 3) {
                   res = number1 * number2;
                   System.out.println("Result = " + res);
               } else if (input == 4){
                   res = number1 / number2;
                   System.out.println("Result = " + res);
               } else {
                   System.out.println("Wrong input!");
               }
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
