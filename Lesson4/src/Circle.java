public class Circle implements Figure {

    private double radius;
    String fullColor;
    String borderColor;
    private static final double PI = Math.PI;

    public Circle(double radius, String fullColor, String borderColor) {
        this.radius = radius;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculatePerimetre() {
        return 2 * PI * radius;
    }
    @Override
    public double calculateArea(){
        return PI * radius * radius;
    }
    @Override
    public String fullColor(){
        return this.fullColor;
    }
    @Override
    public String borderColor(){
        return this.borderColor;
    }
}

