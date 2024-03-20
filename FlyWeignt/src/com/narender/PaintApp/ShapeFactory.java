package com.narender.PaintApp;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapesMap= new HashMap<>();
    public static Shape createShape(String shapeType){
        Shape shape = null;

        if(shapesMap.get(shapeType)!=null){
            shape =  shapesMap.get(shapeType);
        }else{
            if(shapeType=="circle"){
                shape = new Circle();
            }else if(shapeType=="rect"){
                shape = new Rectangle();
            }
            shapesMap.put(shapeType, shape);
        }
        return shape;
    }
}
