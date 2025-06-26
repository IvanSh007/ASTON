public class Product {
    String name;
    String date;
    String manufacturer;
    String country;
    int price;
    boolean booking;

    public Product(String name, String date, String manufacturer, String country, int price, Boolean booking) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }
    public void print() {
        System.out.println();
        System.out.println(this.name);
        System.out.println(this.date);
        System.out.println(this.manufacturer);
        System.out.println(this.country);
        System.out.println(this.price);
        System.out.println(this.booking);
    }
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung S24 Ultra", "01.02.2024", "Samsung Corp.", "China", 4599, false);
        productsArray[2] = new Product("Samsung S23 Ultra", "01.02.2023", "Samsung Corp.", "USA", 3599, true);
        productsArray[3] = new Product("Samsung S22 Ultra", "01.02.2022", "Samsung Corp.", "Japan", 2599, false);
        productsArray[4] = new Product("Samsung S21 Ultra", "01.02.2021", "Samsung Corp.", "United Kingdom", 1599, false);
        for (Product product : productsArray) product.print();
    }
}