public class Bed {
    private int length;
    private int heigth;
    private int depth;
    private String material;

    public int getLength() {
        return length;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getDepth() {
        return depth;
    }

    public String getMaterial() {
        return material;
    }

    public Bed(int length, int heigth, int depth, String material) {
        this.length = length;
        this.heigth = heigth;
        this.depth = depth;
        this.material = material;
    }
    public void putComforter(){
        System.out.println("Comforter put");
    }
    public void putCushion(){
        System.out.println("Cushion put");
    }
}
