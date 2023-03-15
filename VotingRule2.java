public class VotingRule2 {
    public static void main(String[] args) {
        int age = 27;

        String a = "Citizen";

        if (age >= 18 && a == "Citizen") {
            System.out.println("This person is eligible to vote");
        } else {
            System.out.println("This person is not eligible to vote");

        }
    }
}