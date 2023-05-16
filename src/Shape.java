public abstract class Shape {

    private String name;
    private int a; //длина
    private int b;   // высота

    private int c; // третья сторона  триугольника

    private int radius; // радуис

    public Shape(String name,int radius){  // конструктор для круга
        this.name = name;
        this.radius = radius;
    }



    public Shape(String name, int a, int b) { // контруктор для прямоугольника
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public Shape(String name, int a, int b, int c ){
        this.name= name;
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius=radius;
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c=c;
    }

    public abstract void getPerimeterMethod ();
}
