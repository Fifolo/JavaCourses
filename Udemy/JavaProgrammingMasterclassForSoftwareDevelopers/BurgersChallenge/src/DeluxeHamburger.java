public class DeluxeHamburger extends  BaseHamburger{
    private int price;
    private int cola, colaPrice=3;
    private int chips, chipsPrice=5;

    public DeluxeHamburger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.price= 10;
    }


    public void addAdditions(int cola, int chips){
        if(cola<0 || chips <0){
            System.out.println("Wrong number, you will have to use this function one more time");
        }else if (cola+chips>2){
            System.out.println("You can't have that many");
        }else {
            this.chips=chips;
            this.cola=cola;
            this.price+=cola*this.colaPrice+chips*this.chipsPrice;
        }
    }

    @Override
    public void showPrices() {
        System.out.println("Deluxe Burger comes with chips and cola " +
                "\n and will cost you "+ this.price);
    }
}
