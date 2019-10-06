package week_2;

public class compareTwoStrings {
    public void compareTwoStrings() {
        // 1. compare two strings
        System.out.println("\n");
        String firstString = "qwerty";
        String secondString = "asd";
        System.out.println("1.Equals: " + firstString.equals(secondString));
        // 1. concat two strings
        String concatString = firstString.concat(secondString);
        System.out.println("1.Concat: " + concatString);
    }
}
