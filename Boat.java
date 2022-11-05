public class Boat extends vehicle{

    public void move()
    {
        System.out.println("Boats moves faster.");
    }

    public static void main(String[] args) {
        Boat b1 = new Boat();
        b1.move();
        b1.carry();
    }
}
