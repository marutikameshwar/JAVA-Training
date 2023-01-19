package Day3task;

public class Item {
    protected int itemId;
    protected String name;
    protected int price;
    public Item(int id,String name,int price){
        this.itemId = id;
        this.name = name;
        this.price = price;
    }
    public int getItemId() {
        return itemId;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + "]" ;
    }
    
}
