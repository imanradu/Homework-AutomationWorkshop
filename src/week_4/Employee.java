package week_4;

public class Employee {
    /**
     * Employee class, with attributes: name, age, gender, department, job title.
     * Properties to get, update and delete employee attributes.
     */
    private String name;
    private int age;
    private String gender;
    private String department;
    private String jobTitle;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() { return this.gender; }

    public String getDepartment() {
        return this.department;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }
}
