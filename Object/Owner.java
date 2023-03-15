package Object;

public class Owner {

    public static void main(String[] args) {

        House a = new House();

        a.bedrooms();

        a.parking();

        System.out.println(a.year);

        Car b = new Car();

        System.out.println(b.model);
        System.out.println(b.price);
    }
}
