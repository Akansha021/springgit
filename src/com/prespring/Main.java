package com.prespring;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape1=new Rectangle();
        ShapeArea shapeArea1=new ShapeArea();
        shapeArea1.shape(shape1); //We are injecting object shape1 to object(shapeArea1) of ShapeArea class

        Shapes shape2=new Square();
        ShapeArea shapeArea2=new ShapeArea();
        shapeArea1.shape(shape2);//We are injecting object shape2 to object(shapeArea1) of ShapeArea class

        //Dependency Injection means making a class independent of other classes. Here, ShapeArea Class is not
        //dependent on class Rectangle and Square. We can inject objects to ShapeArea Class according to requirement
    }
}