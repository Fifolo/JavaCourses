public class Floor {
    private double lenght;
    private double width;

    public Floor(double lenght, double width) {
        this.width = (width < 0) ? 0 : width;
        this.lenght = (lenght < 0) ? 0 : lenght;
    }

    public double getArea() {
        return this.lenght * this.width;

    }
}
