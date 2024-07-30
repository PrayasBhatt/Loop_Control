import java.util.Scanner;

public class Hotcold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int num = 75;

//        if (int number > int num + 5 && int number < int num - 5){
//            System.out.println("Hot");
//        }

//        if (int number > int num + 5 && int number < int num -5 || number )


//        if (number > num - 5 && number < num +5){
//            System.out.println("Hot");
//        } else if (number > num - 10 && number < num +10){
//            System.out.println("Cold");
//        } else if (number > num - 20 && number < num +20){
//            System.out.println("Extreme Cold");
//        } else if (number > num - 2 && number < num +2 ){
//            System.out.println("Extreme Hot");
//        }

        if (number == num ){
            System.out.println("Congratulations you guessed the number.");
        }
        else if (number > num - 2 && number < num + 2){
            System.out.println("Extreme Hot");
        } else if (number > num-5 && number < num + 5){
            System.out.println("Hot");
        } else if (number > num - 15 && number < num + 15){
            System.out.println("Cold");
        } else if (number > num - 30 && number < num + 30){
            System.out.println("Extreme Cold");
        }
    }
}
