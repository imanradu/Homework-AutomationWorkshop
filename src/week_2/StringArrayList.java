package week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringArrayList {
    public void stringArrayList() {
        // 3. string, array of strings, list of strings
        System.out.println("\n");
        String emptyString = new String(); // empty string
        String[] emptyArrayOfStrings = new String[10]; // empty array of strings
        List<String> listOfStrings = new ArrayList<String>(); // list of strings

        Random rand = new Random();
        int list_length = rand.nextInt(10) + 1;
        for (int k = 0; k < list_length; k++) {
            int string_length = rand.nextInt(10) + 1;
            String str7 = new String();
            for (int j = 0; j < string_length; j++) {
                str7 = str7 + ((rand.nextBoolean() == true) ? (char) (rand.nextInt(25) + 'A') : (char) (rand.nextInt(25) + 'a'));
            }
            listOfStrings.add(str7);
        }
        for (String str : listOfStrings) {
            if ("aeiouAEIOU".indexOf(str.charAt(0)) != -1) {
                str = str.toLowerCase();
                emptyString = emptyString.concat(str);
            } else {
                emptyArrayOfStrings[listOfStrings.indexOf(str)] = str.toUpperCase();
            }
            if (str.indexOf('x') == 1 || str.indexOf('X') == 1 || str.length() < 3) {
                System.out.println(str + ": skipped");
                listOfStrings.set(listOfStrings.indexOf(str), "skipped");
            }
        }
        System.out.println("emptyString(vowel, lower): " + emptyString);
        System.out.print("emptyArrayOfStrings(consonant, upper): ");
        for(String str: emptyArrayOfStrings) {
            System.out.print(str + ", ");
        }
        System.out.print("\nlistOfStrings(random string): " + listOfStrings);
    }
}
