public class Drawer1 {
    private int socks;
    private int pants;
    private boolean isOpen=false;

    public Drawer1(int socks, int pants) {
        this.socks = socks;
        this.pants = pants;
    }

    public int getSocks() {
        return socks;
    }

    public int getPants() {
        return pants;
    }
    public void openDrawer1(){
        System.out.println("Drawer1 opened");
    }
    public void closeDrawer1(){
        System.out.println("Drawer1 closed");
    }
}
