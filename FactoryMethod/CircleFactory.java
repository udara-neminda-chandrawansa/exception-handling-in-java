package week05.factorymethod;

// Concrete Factory - Circle
public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
