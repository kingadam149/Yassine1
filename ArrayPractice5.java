import java.util.ArrayList;

public class ArrayPractice5 {

    public static void main(String[] args) {

        int a[] = {10,12,30,45,50,69,90};

        int c[] = new int[6];

        a[0] = 10;
        a[1] = 12;
        a[2] = 30;
        a[3] = 45;
        a[4] = 50;
        a[5] = 69;
        a[6] = 90;

        for(int i= 0; i < a.length; i++){
            System.out.println(a [i]);
        }

        ArrayList<String> cars = new ArrayList<String>();

        cars.add ("Nissan");
        cars.add ("Honda");
        cars.add ("Volvo");
        cars.add ("Toyota");
        cars.add ("Mercedes");

        System.out.println(cars);

        for(int d = 0; d < cars.size(); d++){
            System.out.println(cars.get(d));

        }






    }
}
