package com.narender.PaintApp;

public class PaintApp {

    public static void render(int noOfShapes){
        //Shape[] shapes = new Shape[noOfShapes+1];

        for(int i=1;i<=noOfShapes;i++){
            Shape shape = null;
            if(i%2==0){
                //New Object Created EveryTime
                //shapes[i] = new Rectangle(2*i, i, "white");
                shape = ShapeFactory.createShape("circle");
                shape.draw(i,"red");


            }else{

                //shapes[i] = new Rectangle(2*i, i, "white");
                //shapes[i].draw(2*i, i, "red");

                shape = ShapeFactory.createShape("rect");
                shape.draw(2*i, i, "blue");

            }
        }

    }


}
