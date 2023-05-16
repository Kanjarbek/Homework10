public class Rectangle extends Shape{
    public Rectangle(String name, int a, int b) {
        super(name, a, b);
    }

    @Override
    public void getPerimeterMethod() {
        System.out.println(getName()+" perimeter is: "+getA()+getB()+getA()+getB());
    }
}
