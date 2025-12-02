public class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private String fullColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fullColor, String borderColor){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculatePerimetre(){
        return sideA + sideB + sideC;
    }
    @Override
    public double calculateArea(){
        double s = calculatePerimetre() / 2.0;
        double expression = s * (s - sideA) * (s - sideB) * (s - sideC);
        return Math.sqrt(expression);
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
