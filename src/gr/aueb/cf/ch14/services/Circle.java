package gr.aueb.cf.ch14.services;

import gr.aueb.cf.ch14.Shape;

public class Circle extends Shape {

    public Circle() {

    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
