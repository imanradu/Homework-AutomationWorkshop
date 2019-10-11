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
        System.out.print("Search for employee: ");
        for (int id = 0; id < employees.size(); id ++) {
//            String employee = (String) employees.values().toArray()[id].name;
//            if (employee == input.next()) {
//                System.out.println(employee);
            }

        }
    }

    public void removeEmployee(HashMap employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("Remove employee: ");
        input.next();
    }

    public void updateEmployee(HashMap employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("Update employee: ");
//        employees.input.next();
        System.out.println("Field: ");
//        input.next();
        System.out.println("Value: ");
//        input.next();
    }

    public void mainMenu(HashMap employees) {
        System.out.println(">>> Organization <<<");
        System.out.println("1. Adding employees");
        System.out.println("2. Searching for employees");
        System.out.println("3. Removing employees");
        System.out.println("4. Updating employee information");
        System.out.println("5. Exit from the MainMenu");
        System.out.println("Choose an option: ");
        Scanner input = new Scanner(System.in);
        Organisation Softvision = new Organisation();

        int menuOption = input.nextInt();
        switch (menuOption) {
            case 1:
                Softvision.addEmployee(employees);
                mainMenu(employees);
                break;
            case 2:
                Softvision.searchEmployee(employees);
                mainMenu(employees);
                break;
            case 3:
                Softvision.removeEmployee(employees);
                mainMenu(employees);
                break;
            case 4:
                Softvision.updateEmployee(employees);
                mainMenu(employees);
                break;
            case 5:
                break;
        }
    }

    public static void main(String[] args) {
        Organisation org = new Organisation();
        HashMap<Integer, Employee> employees = new HashMap<>();
        org.mainMenu(employees);
    }
}
