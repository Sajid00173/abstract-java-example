
public class Car extends vehicle {
    public void move()
    {
        System.out.println("Cars moves faster.");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.move();
        c1.carry();
    }
}
