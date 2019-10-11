package week_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Organisation extends Employee {
    public void addEmployee(HashMap employees) {
        Employee newEmployee = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        newEmployee.setName(input.next());
        System.out.print("Gender: ");
        newEmployee.setGender(input.next().charAt(0));
        System.out.print("Age: ");
        newEmployee.setAge(input.nextInt());
        System.out.print("Department: ");
        newEmployee.setDepartment(input.next());
        System.out.print("Job Title: ");
        newEmployee.setJobTitle(input.next());
        employees.put(employees.size() + 1, newEmployee);
    }

    public void searchEmployee(HashMap employees) {
        Scanner input = new Scanner(System.in);
        System.out.print("Search: ");
//        employees.containsValue(input.next());
    }

    public void removeEmployee(HashMap employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("Remove: ");
//        employees.remove(input.next());
    }

    public void updateEmployee(HashMap employees) {

    }

    public int mainMenu() {
        System.out.println(">>> Organization <<<");
        System.out.println("1. Adding employees");
        System.out.println("2. Searching for employees");
        System.out.println("3. Removing employees");
        System.out.println("4. Updating employee information");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void main(String[] args) {
        HashMap<Integer,Employee> employees=new HashMap<>();
        Organisation Softvision = new Organisation();

        switch (Softvision.mainMenu()) {
            case 1:
                Softvision.addEmployee(employees);
            case 2:
                Softvision.searchEmployee(employees);
            case 3:
                Softvision.removeEmployee(employees);
            case 4:
                Softvision.updateEmployee(employees);
        }
    }

}
