package week_1;

import java.util.Random;

public class Operations {
    public void operations() {
        Random rand = new Random();
        // 5. week_1.operations
        System.out.println("\n\nOperations (5.a, b, c):");
        int day = 9;
        int month = 6;
        int year = 94;
        // 5.a: increment
        System.out.println(" Increment: " + ++day + "/" + month++ + "/" + ++year);
        // 5.b: random arithmetic week_1.operations
        System.out.println(" Arithmetic(*, /, +, %, -): " + (day * month / year) + (day % month) + (year - month));
        // 5.c: comparison
        System.out.println("\nComparison: ");
        System.out.println(" " + day + " > " + month + ": " + (day > month));
        System.out.println(" " + day + " < " + month + ": " + (day < month));
        System.out.println(" " + day + " >= " + month + ": " + (day >= month));
        System.out.println(" " + day + " <= " + month + ": " + (day <= month));
        // 6.a: Using an if-else statement, compare the values
        System.out.println("\nEx 6.a, b, c");
        int x = rand.nextInt();
        int y = rand.nextInt();
        if (x > y) {
            System.out.println(x + " is larger than " + y);
        } else if (x < y) {
            System.out.println(y + " is larger than " + x);
        } else {
            System.out.println(x + " is equal to " + y);
        }
    }
}
