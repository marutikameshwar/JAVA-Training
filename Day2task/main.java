package Day2task;

public class main {
    public static void main(String []args){
        Shape c = new Circle (5,"circle");
        Shape s = new Square(6, "square");
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }
}
