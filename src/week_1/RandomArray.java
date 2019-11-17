package week_1;

import java.util.Random;

public class RandomArray {
    /**
     * Array
     */
    public void randomArray() {
        Random rand = new Random();
        // 7. array of 10 elements, using random values from range 1 to 100, which needs to include number 15
        System.out.println("\nex 7.a \n");
        int[] arr7 = new int[10];
        for (int j = 0; j < arr7.length; j++) {
            arr7[j] = rand.nextInt(100) + 1;
        }
        arr7[rand.nextInt(10)] = 15;
        System.out.println("initial array");
        for (int value : arr7) {
            System.out.print(value + ", ");
        }
        // 7.a: If an element has value 15, skip printing this value.
        System.out.println("\nskipping 15:");
        for (int value : arr7) {
            if (value != 15) {
                System.out.println(value);
            }
        }
    }
}
