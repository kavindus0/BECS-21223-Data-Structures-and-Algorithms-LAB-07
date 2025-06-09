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

    public char getGrade() {
        return grade;
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
