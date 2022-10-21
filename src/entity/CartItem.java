package entity;

public class CartItem{


    //----------------------Fields ---------------------------------------------------------------------
    private Item item;
    private int quantity;


    //----------------------Constructor ---------------------------------------------------------------------
    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }


    //----------------------Getter and Setter ---------------------------------------------------------------------
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
