public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String manufacturerCountry;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String manufacturerCountry, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.manufacturerCountry = manufacturerCountry;
        this.price = price;
        this.isReserved = isReserved;
    }
    public void information() {
        System.out.println("Информация о товаре");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + manufacturerCountry);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование: " + isReserved);
    }
}