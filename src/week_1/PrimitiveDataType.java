package week_1;

import java.util.Random;

public class PrimitiveDataType {
    public void primitiveDataType() {
        Random rand = new Random();

        // 4.a: primitive data types
        System.out.println("Primitive data-types (4.a): ");
        boolean b = rand.nextBoolean();
        System.out.println(" Boolean: " + b);
        char c = (char) (rand.nextInt(26) + 'a');
        System.out.println(" Char: " + c);
        int i = rand.nextInt();
        System.out.println(" Int: " + i);
        long l = rand.nextLong();
        System.out.println(" Long: " + l);
        double d = rand.nextDouble();
        System.out.println(" Double: " + d);
    }
}

