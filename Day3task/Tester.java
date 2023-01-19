package Day3task;

public class Tester {
    public static void main(String [] args){
        DivisionException d = new DivisionException();
        d.division(6, 0);
        Trywithres t = new Trywithres();
        t.multiply();

        Item i1 = new Item(101, "F23", 17000);
        Item i2 = new Item(102, "S23", 70000);
        Item i3 = new Item(103, "M23", 15000);

        Cart cart = new Cart();
        try{
            cart.getItems();
        }catch(CartEmptyException e){
            System.out.println("cart empty bro");
        }
        cart.addItem(i1);
        cart.addItem(i2);
        cart.addItem(i3);

        try{
            System.out.println(cart.getItems());
        }catch(CartEmptyException e){
            System.out.println("cart empty bro");
        }
    }
}
