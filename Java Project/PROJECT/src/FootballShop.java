public abstract class FootballShop  {

    private String brand;
    private double price;
    private int quantity;
    
    public FootballShop(String brand, double price, int quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public FootballShop() {
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

  abstract void display();
  abstract double calcPrice();

}
