package Question01;

public class List {

    private int maxSize;
    private int position;
    private Student[] listEntry;

    public List(int size) {
        maxSize = size;
        listEntry = new Student[maxSize];
        position = -1;
    }

    boolean isListFull(){
        return position==maxSize;
    }
    boolean isListEmpty(){
        return position==-1;
    }

    int ListSize(){
        return position+1;
    }

    void insertLast(Student x) {
        if (isListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            listEntry[++position] = x;
    }

    Student retrieveList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to retrieve from an empty list");
            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for retrieval");
            return null;
        } else {
            return listEntry[p];
        }
    }



    private int listSize() {
        return maxSize;
    }

    void BinarySearch(char key,List studentDetails){
        int min=0;
        int max = listEntry.length-1;
        while (min<=max) {

            int mid = (min + max)/2;
            char midGrade = studentDetails.retrieveList(mid).getGrade();

            if (key<midGrade) {
                max = min - 1;

            } else if (key>midGrade) {
                min = max + 1;

            } else {
                System.out.println("Student with "+studentDetails.retrieveList(mid).studentNo );

            }

            System.out.println("Not Found");
        }

    }

//    String SequentialSearch(List studentDetails){
//        if (studentDetails)
//    }


}
