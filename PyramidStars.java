import java.util.Scanner;

public class PyramidStars {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i,j,k,r;
        r=n;
        for(i=1;i<=r;i++){
            for(j=1; j<=r; j++){
                System.out.print(" ");
            }
            n--;
            for(k=1; k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}






