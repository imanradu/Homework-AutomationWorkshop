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
        newEmployee.setGender(input.next());
        System.out.print("Age: ");
        newEmployee.setAge(input.nextInt());
        System.out.print("Department: ");
        newEmployee.setDepartment(input.next());
        System.out.print("Job Title: ");
        newEmployee.setJobTitle(input.next());
        employees.put(employees.size() + 1, newEmployee);
    }

    public void addEmployee(HashMap employees, String name, String  gender, int age, String department, String jobTitle) {
        Employee newEmployee = new Employee();
        newEmployee.setName(name);
        newEmployee.setGender(gender);
        newEmployee.setAge(age);
        newEmployee.setDepartment(department);
        newEmployee.setJobTitle(jobTitle);
        employees.put(employees.size() + 1, newEmployee);
    }

    public void displayEmployee(Map.Entry<Integer, Employee> employee) {
        System.out.println("\n>>> The employee is: " + "\nName: " + employee.getValue().getName()
                + "\nGender: " + employee.getValue().getGender()
                + "\nAge: " + employee.getValue().getAge()
                + "\nDepartment: " + employee.getValue().getDepartment()
                + "\nJob Title: " + employee.getValue().getJobTitle()
                + "\nUser id: " + employee.getKey());
    }

    public void searchEmployee(HashMap<Integer, Employee> employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n>>> Search engine <<<");
        System.out.println("1. Search by Name ");
        System.out.println("2. Search by Gender ");
        System.out.println("3. Search by Age ");
        System.out.println("4. Search by Department ");
        System.out.println("5. Search by Job Title ");
        System.out.println("Choose and option: ");
        int searchOption = input.nextInt();
        switch (searchOption) {
            case 1: {
                System.out.println("Name: ");
                String name = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getName().equals(name))
                        displayEmployee(employee);
                }
                break;
            }
            case 2: {
                System.out.println("Gender: ");
                String gender = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getGender().equals(gender))
                        displayEmployee(employee);
                }
                break;
            }
            case 3: {
                System.out.println("Age: ");
                int age = input.nextInt();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getAge() == age)
                        displayEmployee(employee);
                }
                break;
            }
            case 4: {
                System.out.println("Department: ");
                String department = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getDepartment().equals(department))
                        displayEmployee(employee);
                }
                break;
            }
            case 5: {
                System.out.println("Job Title: ");
                String jobTitle = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getJobTitle().equals(jobTitle))
                        displayEmployee(employee);
                }
                break;
            }
        }
    }

    public void removeEmployee(HashMap employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user id: ");
        employees.remove(input.nextInt());
    }

    public void updateEmployee(HashMap<Integer, Employee> employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user id: ");
        int userID = input.nextInt();
        for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
            if (employee.getKey() == userID) {
                System.out.println("\nUpdating user: ");
                displayEmployee(employee);
                System.out.println("\n1. Update name");
                System.out.println("2. Update department");
                System.out.println("3. Update job title");
                int updateOption = input.nextInt();
                switch (updateOption) {
                    case 1: {
                        System.out.println("New name is: ");
                        String name = input.next();
                        employee.getValue().setName(name);
                        break;
                    }
                    case 2: {
                        System.out.println("New department is");
                        String department = input.next();
                        employee.getValue().setDepartment(department);
                        break;
                    }
                    case 3: {
                        System.out.println("New job title is:");
                        String jobTitle = input.next();
                        employee.getValue().setJobTitle(jobTitle);
                        break;
                    }
                }
                System.out.println("Updated employee is:");
                displayEmployee(employee);
            }
        }
    }

    public void mainMenu(HashMap employees) {
        System.out.println("\n>>> Organization <<<");
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
}
