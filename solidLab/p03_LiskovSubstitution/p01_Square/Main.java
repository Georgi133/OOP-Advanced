package SOLID.solidLab.p03_LiskovSubstitution.p01_Square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Shape rectangle = new Rectangle(10,5);




        printShapeArea(rectangle);

        Shape square = new Square(5);
        Square square1 = (Square) square;

        square1.setWidth(0);
        printShapeArea(square1);

        printShapeArea(rectangle);


        printShapeArea(square);
    }

    public static void printShapeArea(Shape shape){
        System.out.println(shape.getArea());

    }

}
