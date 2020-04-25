public class Main {
    public static void main(String[] args) {
        VipCustomer Filip = new VipCustomer();
        VipCustomer Marek = new VipCustomer("Marek", 5000);
        VipCustomer Kuba = new VipCustomer("Kuba",6000,"kuba.com");
        System.out.println("Filip's name is "+ Filip.getName());
        System.out.println("Marek's name is "+ Marek.getName());
        System.out.println("Kuba's name is "+ Kuba.getName());


    }
}
