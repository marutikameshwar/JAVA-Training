package Day2task;

public class main {
    public static void main(String []args){
        Circle c = new Circle (5,"circle");
        Square s = new Square(6, "square");
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }
}
