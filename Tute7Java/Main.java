
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean q = true;
        while(q) {
            System.out.println("Welcome...\nThis is a cricket player selection software...");
            System.out.println("Menu.....");
            System.out.println("Add a Player.....................[Press A]");
            System.out.println("View all Players.................[Press V]");
            System.out.println("Display two best batsmen.........[Press B]");
            System.out.println("Display two best bowlers.........[Press C]");
            System.out.println("Display the best Keeper..........[Press D]");
            System.out.println("Quit.............................[Press Q]");
            System.out.println("Please select an option.....");
            String option = myScanner.next();
            PlayerSelection player = new PlayerSelection();
            if (option.equals("A")) {
                player.addPlayer();
                q = true;
            }else if(option.equals("V")) {
                player.viewPlayer();
                q = true;
            }else if(option.equals("B")) {
                player.displayBestBatsmen();
                q = true;
            }else if (option.equals("C")) {
                player.displayBestBowlers();
                q=  true;
            }else if (option.equals("D")) {
                player.displayBestKeeper();
                q = true;
            }else if (option.equals("Q")) {
                q = false;
            }
        }
        System.out.println("Thank you for using the system!!!");
        System.out.println("Have a nice day!!!");
        myScanner.close();
    }
}



