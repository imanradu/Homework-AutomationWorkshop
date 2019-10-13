import week_1.*;
import week_2.*;
import week_4.Employee;
import week_4.Organisation;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // homework week_1
        new NonPrimitiveDataType().nonPrimitiveDataType();
        new PrimitiveDataType().primitiveDataType();
        new Operations().operations();
        new RandomArray().randomArray();

        // homework week_2
        new CompareTwoStrings().compareTwoStrings();
        new CheckPalindrome().checkPalindrome();
        new StringArrayList().stringArrayList();
        new HashMaps().hashMaps();

        // homework 4
        Organisation Sv = new Organisation();
        HashMap<Integer, Employee> employees = new HashMap<>();

        Sv.addEmployee(employees,"Mihai", "M", 25, "QA", "QA");
        Sv.addEmployee(employees,"Andrei", "M", 20, "Dev", "Dev");
        Sv.addEmployee(employees,"Maria", "F", 18, "QA", "QC");

        Sv.mainMenu(employees);

    }
}
