package com.narender.PaintApp;

public  class Circle extends Shape{
    private String shapeType;
/*    private int radius;
    private String color;*/

    public Circle() {
        this.shapeType = "Circle";
    }

/*    public Circle(int radius, String color) {
        this();
        this.radius = radius;
        this.color = color;
    }*/


    @Override
    public void draw(int radius, String color) {
        System.out.println(this.shapeType + " : {  radius "+ radius + ", Color : "+ color+" }");
    }
}
