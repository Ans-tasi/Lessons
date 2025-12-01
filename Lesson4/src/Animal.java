public class Animal {

    protected String type;
    protected String name;
    protected int distanceRun;
    protected int distanceSwim;
    protected boolean canSwim;

    private static int totalAnimalCount = 0;
    private static int totalCatCount = 0;
    private static int totalDogCount = 0;

    protected Animal(String type, String name, int distanceRun, int distanceSwim,
                     boolean canSwim) {
        this.type = type;
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.canSwim = canSwim;

        totalAnimalCount++;
        if (type.equals("Кот")) {
            totalCatCount ++;
        } else if (type.equals("Собака")) {
            totalDogCount ++;
        }
    }

    public void run (int distance) {
        if (distance <= this.distanceRun) {
            System.out.println(this.type + " " + this.name + " пробежал(а) " + distance + " м" );
        } else {
            System.out.println(this.type + " " + this.name + " не может пробежать " + distance + " м" );
        }
    }

    public void swim (int distance) {
        if (!this.canSwim) {
            System.out.println(this.type + " " + this.name + " не умеет плавать");
        } else if (distance <= this.distanceSwim) {
            System.out.println(this.type + " " + this.name + " проплыл(а) " + distance + " м");
        } else {
            System.out.println(this.type + " " + this.name + " не может проплыть " + distance + " м");
        }
    }

    public static int getTotalDogCount() {
        return totalDogCount;
    }

    public static int getTotalCatCount() {
        return totalCatCount;
    }

    public static int getTotalAnimalCount() {
        return totalAnimalCount;
    }

}
