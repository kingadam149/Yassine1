package inheritance;

public class Mobile extends Laptop{


    String email = "gmail";
    String ide =  "";
    String calender = "Google";

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.emailApp();

    }

    void emailApp(){
        System.out.println(email);
    }

}
