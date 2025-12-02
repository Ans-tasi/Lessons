public class Rectangle implements Figure {

    private double width;
    private double height;
    private String fullColor;
    private String borderColor;

    public Rectangle(double width, double height, String fullColor, String borderColor){
        this.width = width;
        this.height = height;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculatePerimetre(){
        return 2 * (width + height);
    }
    @Override
    public double calculateArea(){
        return width * height;
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
