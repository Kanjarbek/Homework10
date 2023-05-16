public class Circle extends Shape{

    public Circle(String name, int radius) {
        super(name,radius);
    }




    @Override
    public void getPerimeterMethod() {
        System.out.println(getName()+" perimeter is: "+Math.PI*2*getRadius());
    }
}
