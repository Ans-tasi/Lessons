public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Мишка плюшевый", "10.06.2021", "ООО Мечта",
                "Россия", 702.99, true);
        productsArray[1] = new Product("Кукла Барби", "20.05.2020", "ООО Детство",
                "Беларусь", 1250.99, false);
        productsArray[2] = new Product("Мяч футбольный", "05.07.2018", "КореяПартс",
                "Корея", 890.99, true);
        productsArray[3] = new Product("Калейдоскоп", "01.01.2024", "Фабер",
                "Китай", 250.00, true);
         productsArray[4] = new Product("Юла", "10.10.2025", "ООО Радость",
                "Россия", 150.99, false);

        System.out.println("Список всех товаров");
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].information();
        }

        Park centerPark = new Park("Центральный парк");
        Park.Attraction carousel = centerPark.new Attraction("Карусель", "10:00",
                "22:00", 350);
        carousel.attractionInformation();

        Park.Attraction horses = centerPark.new Attraction("Лошадки", "12:00",
                "20:00", 500);
        horses.attractionInformation();


    }
}
