public interface Shape {
    String name();
    int numberOfCorners();
    String setColor();
    default void printName(){
        System.out.println("Figure name is " + name() + " color is " + setColor() + " have " + numberOfCorners() + " corners");
    }
}
