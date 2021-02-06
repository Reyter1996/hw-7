public class Parallelogram implements Shape {
    @Override
    public String name() {
        return "Parallelogram";
    }

    @Override
    public int numberOfCorners() {
        return 4;
    }

    @Override
    public String setColor() {
        return "white";
    }
}
