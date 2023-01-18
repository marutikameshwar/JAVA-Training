package Day2task;

class Shape {
    protected String shape_name;
    Shape(String name){
        this.shape_name = name;

    }
    public double calculateArea(){
        return 0.0;
    }
}

class Square extends Shape{
    protected int side;
    Square(int side,String name){
        super(name);
        this.side = side;
    }
    public double calculateArea(){
        return side * side;
    }
}

class Rectangle extends Shape{
    protected int l;
    protected int b;
    Rectangle(int l,int b,String name){
        super(name);
        this.l = l;
        this.b = b;

    }
    public double calculateArea(){
        return l*b;
    }
}

class Circle extends Shape{
    protected int r;
    Circle(int r,String name){
        super(name);
        this.r = r;
    }
    public double calculateArea(){
        return Math.PI*r*r;
    }
}
