

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = {new Rectangle("Rectangle",4,5),
        new Rectangle("Rectangle",5,10),
                new Circle("Circle",15),
                new Circle("circle1",12),
                new Triangle("triangle",2,5,8),
                new Triangle("triangle1",4,7,9)
        };

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].getPerimeterMethod();
            
        }
    }
}