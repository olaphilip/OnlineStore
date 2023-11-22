public class Item {
    private static String itemID;
    private String itemName;
    private double price;
    private int quantity;

    public Item(String itemID, String itemName, double price, int quantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void removeItem() {
        System.out.println("Item removed: " + itemName);
    }

    public void addItem(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("Item added: " + itemName);
    }

    // Getters for item details
    public static String getId(){
        return itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String itemID) {
        this.itemID = itemID;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
