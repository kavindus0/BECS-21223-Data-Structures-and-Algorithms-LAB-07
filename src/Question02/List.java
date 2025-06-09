package Question02;

public class List {
    private Employee[] data;
    private int size;
    private int capacity;

    public List(int capacity) {
        this.capacity = capacity;
        this.data = new Employee[capacity];
        this.size = 0;
    }

    public void add(Employee employee) {
        if (size < capacity) {
            data[size++] = employee;
        } else {
            System.out.println("List is full. Cannot add employee.");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        System.out.printf("%-10s %-15s %-15s %-6s\n", "Employee ID", "Name", "Department", "Grade");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-10s %-15s %-15s %-6s\n",
                    data[i].getEmpId(), data[i].getName(),
                    data[i].getDepartment(), data[i].getGrade());
        }
    }

    public void insertionSortByGrade() {
        for (int i = 1; i < size; i++) {
            Employee key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].getGrade().compareTo(key.getGrade()) > 0) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public List findEmployeesByGradeBinary(String targetGrade) {
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
}
