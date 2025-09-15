
public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println("Current food " + f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println("Current food " + f.getCurrentFood());
        System.out.println((int) (Math.random() * 10) + 1);
        f = new Feeder(1000);
        f.simulateOneDay(22);
        System.out.println("Current food " + f.getCurrentFood());
    }
}
