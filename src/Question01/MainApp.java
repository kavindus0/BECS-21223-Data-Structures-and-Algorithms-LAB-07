package Question01;

public class MainApp {
    public static void main(String[] args) {
        List studentDetails = new List(10);

        studentDetails.add(new Student("PS/2017/016", "Amal", 'M', 'A'));
        studentDetails.add(new Student("PS/2017/198", "Binura", 'M', 'A'));
        studentDetails.add(new Student("PS/2017/301", "Chanaka", 'M', 'A'));
        studentDetails.add(new Student("PS/2017/045", "Sarath", 'M', 'B'));
        studentDetails.add(new Student("PS/2017/149", "Nirmala", 'F', 'B'));
        studentDetails.add(new Student("PS/2017/151", "Sithara", 'F', 'B'));
        studentDetails.add(new Student("PS/2017/280", "Kamal", 'M', 'B'));
        studentDetails.add(new Student("PS/2017/273", "Kasuni", 'F', 'C'));
        studentDetails.add(new Student("PS/2017/312", "Akila", 'F', 'C'));
        studentDetails.add(new Student("PS/2017/105", "Dasuni", 'F', 'D'));

        System.out.println("All Student Details:");
        studentDetails.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'B' (Sequential Search):");
        List studentsWithGradeBSeq = studentDetails.findStudentsByGradeSequential("B");
        studentsWithGradeBSeq.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'A' (Sequential Search):");
        List studentsWithGradeASeq = studentDetails.findStudentsByGradeSequential("A");
        studentsWithGradeASeq.display();
        System.out.println("\n---------------------------------------------------\n");

        studentDetails.sortByGrade();
        System.out.println("Student details after sorting by grade (for Binary Search):");
        studentDetails.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'B' (Binary Search after sorting):");
        List studentsWithGradeBBin = studentDetails.findStudentsByGradeBinary("B");
        studentsWithGradeBBin.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'A' (Binary Search after sorting):");
        List studentsWithGradeABin = studentDetails.findStudentsByGradeBinary("A");
        studentsWithGradeABin.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'D' (Binary Search after sorting):");
        List studentsWithGradeDBin = studentDetails.findStudentsByGradeBinary("D");
        studentsWithGradeDBin.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'C' (Sequential Search - original list order):");
        List studentsWithGradeCSeq = studentDetails.findStudentsByGradeSequential("C");
        studentsWithGradeCSeq.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'C' (Binary Search - on sorted list):");
        List studentsWithGradeCBin = studentDetails.findStudentsByGradeBinary("C");
        studentsWithGradeCBin.display();
        System.out.println("\n---------------------------------------------------\n");

    }
}