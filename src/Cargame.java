import java.util.Scanner;

public class Cargame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cmd of hint for hint : ");
        String hint = sc.nextLine();

        if (hint.equals("hint")){
            System.out.println("Type start to start car");
            System.out.println("Type Stop to stop car");
            System.out.println("Type quit to quit game");
        }

        System.out.println("Enter the cmd you want for the car : ");
        String cmd = sc.nextLine();

        if (cmd.equals("start")){
            System.out.println("Car Started");
        }
        else if (cmd.equals("stop")){
            System.out.println("Car Stopped");
        }
        else if (cmd.equals("quit")){
            System.out.println("Game quited");
        }

//        switch (cmd.equals("start")):
//            System.out.println("Car Started");
//        (cmd.equals("stop")):
//            System.out.println("Car Stopped");
//        (cmd.equals("quit")):
//            System.out.println("Game Quitted");
//        switch (true){
//            if (cmd.equals("start")) {
//                System.out.println("Car started");
//            }
//        }
//            break;


//        if (cmd.equals("Car Started")){
//            if (cmd.equals("start")){
//                System.out.println("Car is already started! You cant start two times.");
//            }
//        }

//        for (int i = 0 ; i < cmd.length(); i++) {
            if (cmd.equals("start")) {
                System.out.println("Enter another cmd for the car");
                String cmd2 = sc.nextLine();

                if (cmd2.equals(cmd)) {
                    if (cmd2.equals("start")) {
                        System.out.println("Car already started! You cant start car two times.");
                    } else if (cmd2.equals("stop")) {
                        System.out.println("Car already stopped! You cant stop car two times.");
                    } else if (cmd2.equals("quit")) {
                        System.out.println("Game already quited! You cant quit game two times.");
                    }
                }
            }
//        }
    }
}
