public class SoccerBall extends FootballShop {
    
    private int ballType;

    public SoccerBall() {
        super();
    }

    public SoccerBall(String brand, double price, int quantity, int ballType) {
        super(brand, price, quantity);
        this.ballType = ballType;
        switch (ballType) {
            case 1:
                setPrice(200);
                break;
            case 2: 
                setPrice(80);
                break;
            case 4:
                setPrice(20);
                break;
            default:
                setPrice(50);
                break;
        }
    }

    @Override
    public double calcPrice(){
        return ballType == 1 ? 200 : ballType == 2 ? 80 : ballType == 4 ? 20 : 50;
    }
    

    @Override
    public void display(){
        System.out.println("SOCCER BALLS");
        System.out.println("Brand : " + getBrand());
        try {
            if(!(ballType >= 1 && ballType <= 4)){
                throw new NotBallTypeException('\n' + (ballType + " Not a valid soccer ball type, Changing soccer ball type to trainig ball. " + '\n'));    
            }
            System.out.println("Type : " +  (ballType == 1 ? "Professional Match" : ballType == 2 ? "Match" : ballType == 4 ? "Recreational" : "Training"));
            System.out.println("Price : $" + calcPrice());
            System.out.println("No Discount !");
            System.out.println("Quantity : " + getQuantity());
            System.out.println("Subtotal : $" + (calcPrice() * getQuantity()));
        }catch (NotBallTypeException e) {
            System.out.println(e.getMessage());
            ballType = 3;
            display();
        }
    }

}
