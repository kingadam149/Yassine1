import java.util.ArrayList;

public class ArrayList8 {
    public static void main(String[] args){

        String[] c = {"Ahmed","Yassine","Adam"};

        String[] b = new String[3];

        c[0] = "Ahmed";
        c[1] = "Yassine";
        c[2] = "Adam";


        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Honda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("SAB");
        cars.add("Ford");
        cars.add(4,"Mercedes");

        System.out.println(cars);

        for(int a = 0; a < cars.size();a++){
            System.out.println(cars.get(a));
        }

        int sum = 0;

        for(int y = 0; y < cars.size(); y++ ){

            //sum = sum + cars.get(y);
        }
        System.out.println(sum);


        }


    }

