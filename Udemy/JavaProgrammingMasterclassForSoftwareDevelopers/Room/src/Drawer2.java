public class Drawer2 {
    private int shirts;
    private int trousers;
    public boolean isOpen=false;

    public void openDrawer2(){
        System.out.println("Drawer 2 opened");
    }
    public void closeDrawer2(){
        System.out.println("Drawer 2 closed");
    }

    public int getShirts() {
        return shirts;
    }

    public int getTrousers() {
        return trousers;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Drawer2(int shirts, int trousers) {
        this.shirts = shirts;
        this.trousers = trousers;
    }
}
