public class Room {
    private String name;
    private int heigth;
    private int width;
    private int depth;

    private Bed bed;
    private theWindoW theWindow;
    private Wardrobe wardrobe;

    public Room(String name, int heigth, int width, int depth, Bed bed, theWindoW theWindow, Wardrobe wardrobe) {
        this.name = name;
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
        this.bed = bed;
        this.theWindow = theWindow;
        this.wardrobe = wardrobe;
    }
    public void changeWallsColor(){
        System.out.println("Changed color of the walls");
    }
    public void expandRoom(){
        this.depth+=5;
        this.width+=3;
        this.heigth+=4;
    }
    public void makeBed(){
        bed.putCushion();
        bed.putComforter();
    }

    public Bed getBed() {
        return bed;
    }

    public theWindoW getTheWindow() {
        return theWindow;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
