package javaapplication20;

import java.util.Scanner;

public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Gimme a");
        double a = Double.parseDouble(keyboard.nextLine());
        System.out.println("gimme b");
        double b = Double.parseDouble(keyboard.nextLine());
        System.out.println("gime c");
        double c = Double.parseDouble(keyboard.nextLine());
        QuadraticSolver qs = new QuadraticSolver(a, b, c);
        System.out.println(qs.toString());
    }

}
