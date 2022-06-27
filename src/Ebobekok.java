import java.util.Scanner;

public class Ebobekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("A sayısını gir :");
        int a = input.nextInt();

        System.out.println("B sayısını gir :");
        int b = input.nextInt();
        int ebob =1;



        for (int i =1 ; i<=a ;i++){
            if (a%i==0 && b%i==0){

                ebob = i;

            }



        }
        System.out.println("Ebob :"+ebob);

        int ekok;
        ekok =(a*b)/ebob;
        System.out.println("Ekok :" + ekok);


    }
}
