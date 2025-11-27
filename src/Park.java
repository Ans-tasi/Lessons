public class Park {
    private String namePark;
    public Park (String namePark) {
        this.namePark = namePark;
    }
    public class Attraction {
        private String nameAttraction;
        private String timeOpen;
        private String timeClose;
        private double price;

        public Attraction (String nameAttraction, String timeOpen, String timeClose, double price) {
            this.nameAttraction = nameAttraction;
            this.timeOpen = timeOpen;
            this.timeClose = timeClose;
            this.price = price;
        }
        public void attractionInformation () {
            System.out.println("Информация об аттракционах");
            System.out.println("Парк: " + namePark);
            System.out.println("Аттракцион: " + nameAttraction);
            System.out.println("Время работы с " + timeOpen + " до " + timeClose);
            System.out.println("Стоимость билета " + price);
        }
    }
}


