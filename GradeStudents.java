public class GradeStudents {
    public static void main(String[] args){

        int marks = 38;

        if(marks >= 0 && marks <= 40){
            System.out.println("F");
        } else if(marks >= 41 && marks <= 60){
            System.out.println("C");
        } else if(marks >= 61 && marks <= 80){
            System.out.println("B");
        } else if(marks >= 81 && marks <= 100){
            System.out.println("A");
        }
    }
}
