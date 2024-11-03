package week05.factorymethod;

// Concrete Factory - Rectangle
public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
