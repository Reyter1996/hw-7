public class Quad implements Shape {
    @Override
    public String name() {
        return "Quad";
    }

    @Override
    public int numberOfCorners() {
        return 4;
    }

    @Override
    public String setColor() {
        return "black";
    }
}