package Question01;

public class MainApp {
    public static void main(String[] args) {
        List studentDetails = new List(10);

        studentDetails.insertLast(new Student("PS/2017/016", "Amal", 'M', 'A'));
        studentDetails.insertLast(new Student("PS/2017/198", "Binura", 'M', 'A'));
        studentDetails.insertLast(new Student("PS/2017/301", "Chanaka", 'M', 'A'));
        studentDetails.insertLast(new Student("PS/2017/045", "Sarath", 'M', 'B'));
        studentDetails.insertLast(new Student("PS/2017/149", "Nirmala", 'F', 'B'));
        studentDetails.insertLast(new Student("PS/2017/151", "Sithara", 'F', 'B'));
        studentDetails.insertLast(new Student("PS/2017/280", "Kamal", 'M', 'B'));
        studentDetails.insertLast(new Student("PS/2017/273", "Kasuni", 'F', 'C'));
        studentDetails.insertLast(new Student("PS/2017/312", "Akila", 'F', 'C'));
        studentDetails.insertLast(new Student("PS/2017/105", "Dasuni", 'F', 'D'));

        for (int i = 0; i < studentDetails.ListSize(); i++) {
            System.out.println(studentDetails.retrieveList(i));
        }

        studentDetails.BinarySearch('A',studentDetails);
        studentDetails.BinarySearch('B',studentDetails);
        studentDetails.BinarySearch('C',studentDetails);
        studentDetails.BinarySearch('D',studentDetails);



    }
}
