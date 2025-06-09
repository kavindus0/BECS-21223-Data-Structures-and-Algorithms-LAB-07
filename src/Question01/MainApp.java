package Question01;

public class MainApp {
    public static void main(String[] args) {
        List studentDetails = new List(10);

        // i. Input Student's details
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

        // Display them
        System.out.println("All Student Details:");
        studentDetails.display();
        System.out.println("\n---------------------------------------------------\n");

        // ii. Implement a method to find and display the details of all students who have a specific grade

        // Using Sequential Search
        System.out.println("Students with Grade 'B' (Sequential Search):");
        List studentsWithGradeBSeq = studentDetails.findStudentsByGradeSequential("B");
        studentsWithGradeBSeq.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Students with Grade 'A' (Sequential Search):");
        List studentsWithGradeASeq = studentDetails.findStudentsByGradeSequential("A");
        studentsWithGradeASeq.display();
        System.out.println("\n---------------------------------------------------\n");

        // Using Binary Search
        // Note: Binary search requires the list to be sorted by the search key (Grade).
        studentDetails.sortByGrade(); // Sort the list by grade first
        System.out.println("Student details after sorting by grade (for Binary Search):");
        studentDetails.display();
        System.out.println("\n---------------------------------------------------\n");


        System.out.println("Students with Grade 'B' (Binary Search after sorting):");
        List studentsWithGradeBBin = studentDetails.findStudentsByGradeBinary("B");
        studentsWithGradeBBin.display(); // Display method of the result list
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