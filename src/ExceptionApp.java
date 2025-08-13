import java.util.Scanner;

import lgcns.inspire.exception.ExceptionDemo;

public class ExceptionApp {
    public static void main(String[] args) {
        ExceptionDemo app = new ExceptionDemo();
        // String [] stringArr = {"jslim", "lgcns", "inspire"};
        // app.printArr(args);

        // Scanner scan = new Scanner(System.in);
        // System.out.print("숫자를 입력하세요 : ");
        // int number = 0;
        // try {
        //     number = scan.nextInt();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.println(">>> read data : " + number);

        // String result = app.readConsole();
        // System.out.println(">>> result : " + result);

        // try {
        //     app.first(-1);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        app.first(-1);
        System.out.println(">>> main end");
    }
}
