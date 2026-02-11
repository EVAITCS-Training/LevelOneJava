package com.horrorcore;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int choice = scanner.nextInt();
//            System.out.println(choice/2);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        } finally {
//            scanner.close();
//        }

        System.out.println("Hello, Class");
        System.out.println("Good Afternoon My Learners");
        try {
            divisible(10, 0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

//    public static void divisible(int a, int b) {
//        if(a == 0 || b == 0) throw new ArithmeticException("Cannot Divide by Zero");
//        System.out.println(a/b);
//    }

    public static void divisible(int a, int b) throws ArithmeticException {
        System.out.println(a/b);
    }
}
