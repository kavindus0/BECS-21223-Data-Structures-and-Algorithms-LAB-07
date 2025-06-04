package Question01;

public class MainApp {
    public static void main(String[] args) {
        // Create a list to store up to 10 products
        List productList = new List(10);

        // Create product objects for all 10 items
        Product p1 = new Product("P1001", "Toothpaste", "Grocery", 220.00);
        Product p2 = new Product("P1002", "Notebook", "Stationery", 120.00);
        Product p3 = new Product("P1003", "Shampoo", "Grocery", 450.00);
        Product p4 = new Product("P1004", "Pen", "Stationery", 50.00);
        Product p5 = new Product("P1005", "Soap", "Grocery", 110.00);
        Product p6 = new Product("P1006", "Marker", "Stationery", 180.00);
        Product p7 = new Product("P1007", "Chips", "Snacks", 250.00);
        Product p8 = new Product("P1008", "Chocolate", "Snacks", 300.00);
        Product p9 = new Product("P1009", "Rice", "Grocery", 1000.00);
        Product p10 = new Product("P1010", "Biscuit", "Snacks", 200.00);

        // Insert products into the list
        productList.InsertList(0, p1);
        productList.InsertList(1, p2);
        productList.InsertList(2, p3);
        productList.InsertList(3, p4);
        productList.InsertList(4, p5);
        productList.InsertList(5, p6);
        productList.InsertList(6, p7);
        productList.InsertList(7, p8);
        productList.InsertList(8, p9);
        productList.InsertList(9, p10);

        // Display all products
        productList.TraverseList();
        System.out.println("------");
        productList.SelectionSort();
        productList.TraverseList();
    }
}
