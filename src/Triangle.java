public class Triangle implements Shape {
    @Override
    public String name() {
        return "Triangle";
    }

    @Override
    public int numberOfCorners() {
        return 3;
    }

    @Override
    public String setColor() {
        return "yellow";
    }
}
