public class theWindoW {
    private int length;
    private int width;
    private int number;
    private boolean isOpen=false;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getNumber() {
        return number;
    }

    public theWindoW(int length, int width, int number) {
        this.length = length;
        this.width = width;
        this.number = number;
    }
    public void open(){
        this.isOpen=true;
        System.out.println("Window opened");
    }
    public void close(){
        this.isOpen=false;
        System.out.println("Window closed");
    }
}
