import java.util.Scanner;

public class Hotcold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int num = 75;

        if (int number > int num + 5 && int number < int num - 5){
            System.out.println("Hot");
        }

    }
}
