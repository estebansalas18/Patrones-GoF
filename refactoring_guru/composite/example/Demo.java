package refactoring_guru.composite.example;

import refactoring_guru.composite.example.editor.ImageEditor;
import refactoring_guru.composite.example.shapes.Circle;
import refactoring_guru.composite.example.shapes.CompoundShape;
import refactoring_guru.composite.example.shapes.Dot;
import refactoring_guru.composite.example.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        // Shapes
        Circle circulo = new Circle(10, 10, 10, Color.BLUE);

        CompoundShape compuesto1 = new CompoundShape(
            new Circle(110, 110, 50, Color.RED),
            new Dot(160, 160, Color.RED)
        );

        CompoundShape compuesto2 = new CompoundShape(
            new Rectangle(250, 250, 100, 100, Color.GREEN),
            new Dot(240, 240, Color.GREEN),
            new Dot(240, 360, Color.GREEN),
            new Dot(360, 360, Color.GREEN),
            new Dot(360, 240, Color.GREEN)
        );

        editor.loadShapes(
                circulo,
                compuesto1,
                compuesto2
        );

        //circulo.move(200, 20);
        //compuesto2.move(-200, 0);
    }
}