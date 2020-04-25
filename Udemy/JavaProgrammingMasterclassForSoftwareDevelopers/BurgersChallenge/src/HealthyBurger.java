public class HealthyBurger extends BaseHamburger {

    private int price;

    private int lettuce, lettucePrice = 2;
    private int tomato, tomatoPrice = 3;
    private int carrot, carrotPrice = 2;
    private int pickles, picklesPrice = 4;
    private int hotSauce, hotSaucePrice = 1;
    private int garlicSauce, garlicSaucePrice = 1;

    public HealthyBurger(String meat) {
        super("brown rye bread roll", meat);
        this.price=10;
    }

    public void addAdditions(int lettuce, int tomato, int carrot, int pickles, int hotSauce, int garlicSauce) {
        if (lettuce < 0 || tomato < 0 || carrot < 0 || pickles < 0 || hotSauce < 0 || garlicSauce < 0) {
            System.out.println("Wrong number, you will have to use this function one more time");
        } else if (lettuce + tomato + carrot + pickles > 6) {
            System.out.println("Too much, you need to have less than 7 additions");
        } else {
            this.lettuce = lettuce;
            this.tomato = tomato;
            this.carrot = carrot;
            this.pickles = pickles;
            this.hotSauce = hotSauce;
            this.garlicSauce = garlicSauce;
            this.price += hotSauce + garlicSauce + lettuce * this.lettucePrice + tomato * this.tomatoPrice + carrot * this.carrotPrice + pickles * this.picklesPrice;
        }
    }

    @Override
    public void showPrices() {
        System.out.println("Base health burger costs 10zł " +
                "\n you can select up to 6 additions " +
                "\n lettuce for " + this.lettucePrice +
                "\n tomato for " + this.tomatoPrice +
                "\n carrot for " + this.carrotPrice +
                "\n pickles for " + this.picklesPrice +
                "\n hot sauce for "+ this.hotSaucePrice +
                "\n garlic sauce for "+ this.garlicSaucePrice+
                "\n your healthy burger will cost you "+ this.price);
    }
}
