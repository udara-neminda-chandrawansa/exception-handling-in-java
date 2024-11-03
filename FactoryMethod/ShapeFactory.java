package week05.factorymethod;

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("draw method called in rectangle class");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("draw method called in circle class");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("draw method called in square class");
    }
}

//public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

//public abstract class ShapeFactory {
//    public abstract Shape createShape();
//
//    public void drawShape() {
//        Shape shape = createShape();
//        shape.draw();
//    }
//}


