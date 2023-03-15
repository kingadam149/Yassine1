import java.util.ArrayList;

public class Array3 {

    public static void main(String[] args){


        String[] country = new String[6];
        country[0] = "USA";
        country[1] = "UK";
        country[2] = "AUS";
        country[3] = "BD";
        country[4] = "GER";
        country[5] = "ITA";

        for(int i = 0; i < country.length; i++){
            System.out.println(country[i]);
        }

        ArrayList<String> c = new ArrayList<>();

        c.add("USA");
        c.add("UK");
        c.add("AUS");
        c.add("BD");
        c.add("GER");
        c.add("ITA");
        c.add("SPA");

        System.out.println(c);

        System.out.println(c.size());

        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i));
        }


    }
}
