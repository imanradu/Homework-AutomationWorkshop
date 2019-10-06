package week_2;

import java.util.Scanner;

public class checkPalindrome {
    public void checkPalindrome() {
        // 2. check if the string is a palindrome
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a one word string: ");
        String palindromString = input.next();
        String palindromAux = new String();
        for (int i = palindromString.length() - 1; i >= 0; i--) {
            palindromAux = palindromAux + palindromString.charAt(i);
        }
        if (palindromAux.equals(palindromString)) {
            System.out.println("The string is a palindrome: " + palindromString);
        } else
            System.out.println("The string is not a palindrome: " + palindromString);
    }
}
