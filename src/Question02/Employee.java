package Question02;

public class Employee {
    String empId;
    String name;
    String department;
    char grade;

    public Employee(String empId, String name, String department, char grade) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.grade = grade;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGrade() {
        return String.valueOf(grade);
    }
}
