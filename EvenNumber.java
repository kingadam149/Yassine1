public class EvenNumber {

    //We want to print all even number between 1 to 100 //2,4,6,8,,,,98,100

    public static void main(String[] args){

        for(int a = 1; a<= 100; a+=2 ){
            System.out.println(a);
        }

        // 13/5 == 2
        // 13%5 == 3
        // 13-5 => 1, 8
        // 8-5 => 2, 3

        for(int j = 1; j <= 100; j++){
            if(j%2 == 1){
                System.out.println(j);
            }
        }

    }
}
