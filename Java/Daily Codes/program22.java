class FoodOrder {

    String itemName;
    int quantity;
    double price;

    FoodOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
        this.price = 100;
    }

    FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = 100;
    }

    void displayOrder() {
        double total = quantity * price;

        System.out.println("\nItem: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: ₹" + price);
        System.out.println("Total: ₹" + total);
    }

    public static void main(String[] args) {

        FoodOrder f1 = new FoodOrder("Pizza");
        f1.displayOrder();

        FoodOrder f2 = new FoodOrder("Burger", 2);
        f2.displayOrder();
    }
}
