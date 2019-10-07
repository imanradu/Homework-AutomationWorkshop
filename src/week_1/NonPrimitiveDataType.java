package week_1;

public class NonPrimitiveDataType {
    public void nonPrimitiveDataType() {
        // 4.b: non-primitive data types
        System.out.println("\nNon-Primitive data-types (4.b): ");
        String str = "Homework Week 1";
        System.out.println(" String: " + str);
        String[] arr = {"blue", "red", "yellow", "green"};
        System.out.print(" Array: ");
        for (String arrStr : arr) {
            System.out.print(arrStr + ", ");
        }
    }
}
