package Question01;

public class List {
    private Student[] data;
    private int size;
    private int capacity;

    public List(int capacity) {
        this.capacity = capacity;
        this.data = new Student[capacity];
        this.size = 0;
    }

    public void add(Student student) {
        if (size < capacity) {
            data[size++] = student;
        } else {
            System.out.println("List is full. Cannot add student.");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        System.out.printf("%-15s %-15s %-8s %-5s\n", "Student Number", "Name", "Gender", "Grade");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-15s %-15s %-8c %-5s\n",
                    data[i].getStudentNumber(), data[i].getName(),
                    data[i].getGender(), data[i].getGrade());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int listSize() {
        return size;
    }

    public Student retrieveList(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    public void sortByGrade() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j].getGrade().compareTo(data[minIndex].getGrade()) < 0) {
                    minIndex = j;
                }
            }
            Student temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public List findStudentsByGradeBinary(String targetGrade) {
        List resultList = new List(this.size);
        int low = 0;
        int high = size - 1;
        int initialMatchIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = data[mid].getGrade().compareTo(targetGrade);

            if (comparison == 0) {
                initialMatchIndex = mid;
                break;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (initialMatchIndex != -1) {
            resultList.add(data[initialMatchIndex]);

            int tempIndex = initialMatchIndex - 1;
            while (tempIndex >= 0 && data[tempIndex].getGrade().equals(targetGrade)) {
                resultList.add(data[tempIndex]);
                tempIndex--;
            }

            tempIndex = initialMatchIndex + 1;
            while (tempIndex < size && data[tempIndex].getGrade().equals(targetGrade)) {
                resultList.add(data[tempIndex]);
                tempIndex++;
            }
        }
        return resultList;
    }

    public List findStudentsByGradeSequential(String targetGrade) {
        List resultList = new List(this.size);
        for (int i = 0; i < size; i++) {
            if (data[i].getGrade().equals(targetGrade)) {
                resultList.add(data[i]);
            }
        }
        return resultList;
    }
}