public class Main {
    public static void main(String[] args) {
       BaseHamburger baseHamburger = new BaseHamburger("pita","pork");
       baseHamburger.addAdditions(1,1,0,0);
       baseHamburger.showPrices();
        System.out.println(" ");
       HealthyBurger healthyBurger = new HealthyBurger("beef");
       healthyBurger.addAdditions(1,1,1,1,0,0);
       healthyBurger.showPrices();
        System.out.println(" ");
       DeluxeHamburger deluxeHamburger = new DeluxeHamburger("focaccia", "turkey");
       deluxeHamburger.addAdditions(1,1);
       deluxeHamburger.showPrices();
    }
}
