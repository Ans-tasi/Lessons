public class FigureInfo {
    public static void main(String[] args) {

        Circle myCircle = new Circle(10, "Желтный", "Коричневый");
        Rectangle myRectangle = new Rectangle(40, 20, "Красный", "Розовый");
        Triangle myTriangle = new Triangle(2, 5, 6, "Синий", "Черный");

        myCircle.infoFigure();
        myRectangle.infoFigure();
        myTriangle.infoFigure();
    }
}
