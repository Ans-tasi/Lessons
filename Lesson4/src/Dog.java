public class Dog extends Animal {
    public Dog (String name, int distanceRun, int distanceSwim) {
        super("Собака", name, distanceRun, distanceSwim, true);
    }
    public void infoDog() {
        System.out.println("Собака " + name);
    }
}
