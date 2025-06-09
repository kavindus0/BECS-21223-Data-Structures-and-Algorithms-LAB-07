package Question02;

public class MainApp {
    public static void main(String[] args) {
        // Array implementation
        System.out.println("Array Implementation:");
        System.out.println("=====================\n");
        
        List employeeList = new List(10);
        
        employeeList.add(new Employee("EMP001", "Anjali", "HR", 'B'));
        employeeList.add(new Employee("EMP002", "Roshan", "Finance", 'A'));
        employeeList.add(new Employee("EMP003", "Meera", "IT", 'C'));
        employeeList.add(new Employee("EMP004", "Hiran", "HR", 'A'));
        employeeList.add(new Employee("EMP005", "Sanjay", "Marketing", 'B'));
        employeeList.add(new Employee("EMP006", "Vimukthi", "Finance", 'D'));
        employeeList.add(new Employee("EMP007", "Dilani", "IT", 'C'));
        employeeList.add(new Employee("EMP008", "Tharindu", "Marketing", 'A'));
        employeeList.add(new Employee("EMP009", "Ishara", "HR", 'B'));
        employeeList.add(new Employee("EMP010", "Lahiru", "IT", 'D'));

        System.out.println("All Employee Details:");
        employeeList.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Sorting by Grade (Insertion Sort on Array):");
        employeeList.insertionSortByGrade();
        employeeList.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Employees with Grade 'B' (Binary Search on sorted array):");
        List gradeBEmployees = employeeList.findEmployeesByGradeBinary("B");
        gradeBEmployees.display();
        System.out.println("\n---------------------------------------------------\n");

        // Linked List implementation
        System.out.println("Linked List Implementation:");
        System.out.println("==========================\n");
        
        LinkedList employeeLinkedList = new LinkedList();
        
        employeeLinkedList.add(new Employee("EMP001", "Anjali", "HR", 'B'));
        employeeLinkedList.add(new Employee("EMP002", "Roshan", "Finance", 'A'));
        employeeLinkedList.add(new Employee("EMP003", "Meera", "IT", 'C'));
        employeeLinkedList.add(new Employee("EMP004", "Hiran", "HR", 'A'));
        employeeLinkedList.add(new Employee("EMP005", "Sanjay", "Marketing", 'B'));
        employeeLinkedList.add(new Employee("EMP006", "Vimukthi", "Finance", 'D'));
        employeeLinkedList.add(new Employee("EMP007", "Dilani", "IT", 'C'));
        employeeLinkedList.add(new Employee("EMP008", "Tharindu", "Marketing", 'A'));
        employeeLinkedList.add(new Employee("EMP009", "Ishara", "HR", 'B'));
        employeeLinkedList.add(new Employee("EMP010", "Lahiru", "IT", 'D'));

        System.out.println("All Employee Details:");
        employeeLinkedList.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Sorting by Grade (Insertion Sort on Linked List):");
        employeeLinkedList.insertionSortByGrade();
        employeeLinkedList.display();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Employees with Grade 'A' (Search on linked list):");
        LinkedList gradeAEmployees = employeeLinkedList.findEmployeesByGrade("A");
        gradeAEmployees.display();
    }
}
