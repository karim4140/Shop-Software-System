public class Boots extends FootballShop implements DiscConsiderable {

    private int size;

    public Boots(){
        super();
    }

    public Boots(String brand, double price, int quantity, int size) {
        super(brand, price, quantity);
        this.size = size;
    }

    public double calcDisc(){
        double oldPrice = getPrice();
        return oldPrice - (oldPrice * RATE);
    } 

    @Override
    public double calcPrice(){
        return calcDisc() * getQuantity();
    }

    @Override
    public void display(){
        System.out.println("SOCCER BOOTS");
        System.out.println("Brand : " + getBrand());
        System.out.println("Price : $" + getPrice() + " for size " + size);
        System.out.println("Discount : 17.0%");
        System.out.println("Quantity : " + getQuantity());
        System.out.println("Subtotal : $" + calcPrice());

    }



    

    


    
}
