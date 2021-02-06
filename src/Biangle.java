public class Biangle implements Shape {
    @Override
    public String name() {
        return "Biangle";
    }

    @Override
    public int numberOfCorners() {
        return 2;
    }

    @Override
    public String setColor() {
        return "pink";
    }
}
