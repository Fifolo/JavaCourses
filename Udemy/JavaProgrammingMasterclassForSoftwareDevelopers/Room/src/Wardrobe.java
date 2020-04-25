public class Wardrobe {
    private int heigth;
    private int length;
    private String material;
    public boolean isOpen=false;

    private Drawer1 drawer1;
    private Drawer2 drawer2;

    public void openWardrobe(){
        this.isOpen=true;
        System.out.println("Wardrobe has been opened");
        drawer1.openDrawer1();
    }
    public void closeWardrobe(){
        this.isOpen=false;
        System.out.println("Wardrobe has been opened");
    }

    public int getHeigth() {
        return heigth;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public Drawer1 getDrawer1() {
        return drawer1;
    }

    public Drawer2 getDrawer2() {
        return drawer2;
    }

    public Wardrobe(int heigth, int length, String material, Drawer1 drawer1, Drawer2 drawer2) {
        this.heigth = heigth;
        this.length = length;
        this.material = material;
        this.drawer1 = drawer1;
        this.drawer2 = drawer2;
    }
}
