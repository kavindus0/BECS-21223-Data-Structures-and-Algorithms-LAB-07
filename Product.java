package Question01;

public class Product {
    String ProductID;
    String Name;
    String Category;
    double Price;

    public Product(String productID, String name, String category, double price) {
        this.ProductID = productID;
        this.Name = name;
        this.Category = category;
        this.Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductID='" + ProductID + '\'' +
                ", Name='" + Name + '\'' +
                ", Category='" + Category + '\'' +
                ", Price=" + Price +
                '}';
    }
}
