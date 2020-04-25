public class Main {
    public static void main(String[] args) {
        Bed bed= new Bed(3,1,2,"Wood");
        theWindoW theWindow = new theWindoW(1,1,2);
        Drawer1 drawer1 = new Drawer1(6,5);
        Drawer2 drawer2 = new Drawer2(7,4);
        Wardrobe wardrobe = new Wardrobe(3,1,"Wood",drawer1,drawer2);
        Room room = new Room("MyRoom", 4,6,5,bed,theWindow,wardrobe);

        room.getWardrobe().openWardrobe();
        room.getTheWindow().open();
        room.getWardrobe().getDrawer1().openDrawer1();
        room.getBed().putComforter();
        room.getBed().putCushion();
        room.getWardrobe().getDrawer2().closeDrawer2();
        System.out.println("  ");
        room.makeBed();
    }
}
