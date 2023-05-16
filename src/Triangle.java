public class Triangle extends Shape {

    public Triangle(String name, int a, int b, int c) {
        super(name, a, b, c);
    }

    @Override
    public void getPerimeterMethod() {

        System.out.println(getName()+" perimeter is: "+ getA()+getB()+getC());

    }
}
