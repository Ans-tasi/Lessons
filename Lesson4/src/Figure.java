public interface Figure {

    double calculatePerimetre();
    double calculateArea();
    String fullColor();
    String borderColor();

    default void infoFigure(){
        System.out.println("Периметр: " + calculatePerimetre());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки " + fullColor());
        System.out.println("Цвет границы: " + borderColor());
    }
}
