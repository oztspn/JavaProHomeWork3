public class Triangle implements AreaComputable {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height;
    }
}
