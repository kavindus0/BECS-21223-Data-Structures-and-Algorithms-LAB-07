package Question01;

public class Student {
    String studentNo;
    String name;
    char gender;
    char grade; 

    public Student(String studentNo, String name, char gender, char grade) {
        this.studentNo = studentNo;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public String getStudentNumber() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getGrade() { 
           return String.valueOf(grade);
    }


    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setGrade(String grade) {
        if (grade != null && grade.length() == 1) {
            this.grade = grade.charAt(0);
        } else {
            System.err.println("Invalid grade format: " + grade);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
