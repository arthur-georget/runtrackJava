package jour02.job03;

import jour02.job03.figure.rectangle.Rectangle;
import jour02.job03.figure.rectangle.coloredrectangle.ColoredRectangle;
import jour02.job03.figure.circle.Circle;

public class GeometricalFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,50,5,6);
        System.out.println(String.format("Le rectangle fait %s cm par %s cm.", rectangle.getHeight(), rectangle.getWidth()));
        System.out.println(String.format("Sa surface est de %s cm^2.", rectangle.area()));
        rectangle.setHeight(12);
        rectangle.setWidth(321);
        System.out.println(String.format("Le rectangle fait maintenant %s cm par %s cm.", rectangle.getHeight(), rectangle.getWidth()));
        System.out.println(String.format("Sa surface est alors de %s cm^2.", rectangle.area()));

        Circle circle = new Circle(5,10, 20);
        circle.display();
        System.out.println(String.format("La surface du cercle est de %s cm^2", circle.area()));
        double x = 2;
        double y = 4;
        if (circle.isInside(x, y)){
            System.out.println(String.format("Le point %s %s se trouve dans le cercle.", x,y));
        }
        else{
            System.out.println(String.format("Le point %s %s ne se trouve pas dans le cercle.", x,y));
        }

        ColoredRectangle coloredRectangle = new ColoredRectangle(300, 100, 1,9,10);
        System.out.println(String.format("Le rectangle %s fait %s cm par %s cm.", coloredRectangle.getColor(), coloredRectangle.getHeight(), coloredRectangle.getWidth()));
    }
    
}
