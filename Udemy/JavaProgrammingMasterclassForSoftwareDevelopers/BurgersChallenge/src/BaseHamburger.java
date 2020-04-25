public class BaseHamburger {
    private String breadRollType;
    private String meat;
    private int price;

    private int lettuce, lettucePrice = 2;
    private int tomato, tomatoPrice = 4;
    private int carrot, carrotPrice = 3;
    private int pickles, picklesPrice = 5;

    public BaseHamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 10;
    }

    public void addAdditions(int lettuce, int tomato, int carrot, int pickles) {
        if (lettuce < 0 || tomato < 0 || carrot < 0 || pickles < 0) {
            System.out.println("Wrong number, you will have to use this function one more time");
        } else if (lettuce + tomato + carrot + pickles > 4) {
            System.out.println("Too much, you need to have less than 5 additions");
        } else {
            this.lettuce = lettuce;
            this.tomato = tomato;
            this.carrot = carrot;
            this.pickles = pickles;
            this.price += lettuce * this.lettucePrice + tomato * this.tomatoPrice + carrot * this.carrotPrice + pickles * this.picklesPrice;
        }
    }
    public void showPrices() {
        System.out.println("Base burger costs 10zł " +
                "\n you can select up to 4 additions " +
                "\n lettuce for " + this.lettucePrice +
                "\n tomato for " + this.tomatoPrice +
                "\n carrot for " + this.carrotPrice +
                "\n pickles for " + this.picklesPrice +
                "\n your burger will cost you "+ this.price);
    }

}
