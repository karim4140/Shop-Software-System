public class Customer {
    
    private String custName;
    private int numOfItems = 0;
    private double totalPay = 0;
    private FootballShop itemList[];

    public Customer(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public double getTotalPay() {
        return totalPay;
    }

    @Override
    public String toString() {
        return "Welcome " + getCustName() + '\n' + '\n' + "List of Football Items Bought" + '\n';
    }

    public void print(){
        System.out.println("Total : $" + getTotalPay() + '\n');
    }
    
    public void buy(FootballShop product){
        itemList = new FootballShop[10]; //1..10
        itemList[numOfItems] = product;
        numOfItems++;
        totalPay += (product instanceof Boots) ? product.calcPrice() : (product.calcPrice() * product.getQuantity()); //calcPrice not the same
        System.out.println("Item " + numOfItems);
        product.display(); 
        System.out.println();
    }

}
