import java.util.ArrayList;

public class ArrayPractice4 {

    public static void main(String[] args) {

        int[] grades = {65, 70, 80, 95, 98};

        int e = 0;

        for(int i =0; i < grades.length; i++){
            System.out.println(grades[i]);
        }


        String[] country = new String[6];
        int a = 0;

        country[0]="MOR";
        country[1]="SPA";
        country[2]="FRA";
        country[3]="USA";
        country[4]="CAN";
        country[5]="GER";

        for(int t = 0; t < country.length; t++){
            System.out.println(country[t]);

        }

        ArrayList<String> c = new ArrayList<>();

        c.add("MOR");
        c.add("SPA");
        c.add("FRA");
        c.add("USA");
        c.add("CAN");
        c.add("GER");

        for(int f = 0; f < c.size(); f++){
            System.out.println(c.get(f));
        }



        }

    }


