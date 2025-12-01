public class Bowl {
    private int foodCount;
    private final int MIN_FOOD = 1;

    public Bowl (int initialFoodCount){
        if (initialFoodCount >= 0) {
            foodCount = initialFoodCount;
            System.out.println("В миске " + foodCount + " единиц еды");
        } else {
            foodCount = 0;
            System.out.println("В миске не может быть отрицательного количества еды!");
        }
    }
    public void addFood(int count) {
        if (count > 0) {
            foodCount = foodCount + count;
            System.out.println("В миску добавлено " + count + " единиц еды.");
            System.out.println("Всего в миске " + foodCount + " единиц еды.");
        } else {
            System.out.println("В миску нельзя добавить нулевое или отрицательное количество еды!");
        }
    }
    public boolean takeFood (int count) {
        if (foodCount >= count) {
            foodCount = foodCount - count;
            System.out.println("Кот взял " + count + " единиц еды");
            System.out.println("В миске осталось " + foodCount + " единиц еды");
            return true;
        } else {
            System.out.println("Коту не хватает еды!");
            return false;
        }
    }

    public int getFoodCount() {
        return foodCount;
    }
}
