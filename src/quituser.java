import java.util.Scanner;

public class quituser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter : ");
            String input = sc.nextLine();
            System.out.println(input);
            if(input.equals("quit")){
                break;
            }
        }

    }
}
