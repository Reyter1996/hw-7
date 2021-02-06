public class Circle implements Shape {
    @Override
    public String name() {
        String name = "Circle";
        return name;
    }

    @Override
    public int numberOfCorners() {
        return 0;
    }

    @Override
    public String setColor() {
        return "red";
    }
}