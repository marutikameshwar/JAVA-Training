package Day3task;

import java.util.ArrayList;

class CartEmptyException extends Exception{
    public CartEmptyException(String message){
        super (message);
    }
}

public class Cart {
    protected ArrayList<Item> items = new ArrayList<Item>();
    public void addItem(Item i){
        items.add(i);
    }
    public ArrayList<Item> getItems() throws CartEmptyException{
        if(items.size() == 0){
            throw new CartEmptyException("no items in cartttt");
        }else{
            return items;
        }
    }
    
}
