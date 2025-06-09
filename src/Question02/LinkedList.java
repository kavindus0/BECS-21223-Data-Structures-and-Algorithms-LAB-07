package Question02;

public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        Employee data;
        Node next;

        Node(Employee data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Employee employee) {
        Node newNode = new Node(employee);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.printf("%-10s %-15s %-15s %-6s\n", "Employee ID", "Name", "Department", "Grade");
        System.out.println("--------------------------------------------------------");
        Node current = head;
        while (current != null) {
            System.out.printf("%-10s %-15s %-15s %-6s\n",
                    current.data.getEmpId(), current.data.getName(),
                    current.data.getDepartment(), current.data.getGrade());
            current = current.next;
        }
    }

    public void insertionSortByGrade() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            if (sorted == null || sorted.data.getGrade().compareTo(current.data.getGrade()) > 0) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.next != null && 
                       temp.next.data.getGrade().compareTo(current.data.getGrade()) <= 0) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = next;
        }
        head = sorted;
    }

    public LinkedList findEmployeesByGrade(String targetGrade) {
        LinkedList resultList = new LinkedList();
        Node current = head;

        while (current != null) {
            if (current.data.getGrade().equals(targetGrade)) {
                resultList.add(current.data);
            }
            current = current.next;
        }
        return resultList;
    }
}
