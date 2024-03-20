package com.narender.PaintApp;

public  class Rectangle extends Shape {
    private String shapeType;

/*    private int length;
    private int breath;
    private String color;*/

    public Rectangle() {
        this.shapeType = "Rectangle";
    }

/*    public Rectangle(int length, int breath, String color) {
        this();
        this.length = length;
        this.breath = breath;
        this.color = color;
    }*/


    @Override
    public void draw(int length, int breadth, String color) {
        System.out.println(this.shapeType + " : { length : " + length + ",  breath : "+ breadth + ", Color : "+ color+" }");
    }
}
