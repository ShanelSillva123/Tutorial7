
import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection {
    public static int playerAge;
       public static String playerName;
       public static int totalNumberOfRuns;
       public static int totalNumberOfWickets;
       public static String playerType;
      public static ArrayList<String> players =  new ArrayList<String>();
    public void addPlayer() {
        Scanner myScanner = new Scanner (System.in);
        int numberOfPlayers = 0;
        while (numberOfPlayers < 11) {
            for (numberOfPlayers = 0; numberOfPlayers < 11; numberOfPlayers ++) {
                System.out.println(" Please enter the player you wish to add : ");
                playerName = myScanner.nextLine();
                players.add(playerName);
            }
        }
        System.out.println("\n########################################################\n");
    }
    public void viewPlayer() {
        for (int i = 0; i < 11; i++) {
            System.out.println(" Player number " + (i + 1) + " is, " + players.get(i));
        }
        System.out.println("\n########################################################\n");
    }
    public void displayBestBatsmen() {
        System.out.println(" Best Batsmen are the people who are normally in very start of the team ");
        String bestBatsman1 = players.get(0);
        String bestBatsman2 = players.get(1);
        System.out.println("One of the best batsman in our team is " + bestBatsman1);
        System.out.println(" The other best batsman in our team is " + bestBatsman2);
        System.out.println("\n########################################################\n");
    }
    public void displayBestBowlers() {
        System.out.println(" The best bowlers are in the 7th and 8th positions in our team ");
        String bestBowler1 = players.get(6);
        String bestBowler2 = players.get(7);
        System.out.println(" One of  the best bowlers in our team is " + bestBowler1);
        System.out.println(" The other best bowler in our team is " + bestBowler2);
        System.out.println("\n########################################################\n");
    }
    public void displayBestKeeper() {
        System.out.println(" The best keeper in our team is in the 1st position ");
        String bestKeeper = players.get(0);
        System.out.println("The best keeper in our team is " + bestKeeper);
        System.out.println("\n########################################################\n");
    }
    public void displayPlayerDetails() {
        Scanner players = new Scanner(System.in);
        viewPlayer();
        System.out.println(" Enter the players name who's details you require : ");
        playerName = players.nextLine();
        System.out.println(" Enter the age of the particular player : ");
        playerAge = players.nextInt();
        System.out.println(" Enter the type of the particular player : ");
        playerType = players.nextLine();
        System.out.println(" Enter the total number of runs played by the particular player through out the last 15 matches : ");
        totalNumberOfRuns = players.nextInt();
        System.out.println(" Enter the number of wickets taken by the particular player : ");
        totalNumberOfWickets = players.nextInt();
        Player player = new Player(playerName, playerAge, playerType, totalNumberOfRuns, totalNumberOfWickets);
        System.out.println("The batting average of " + playerName + " is " + player.getBattingAverage());
        System.out.println("The bowling average of " + playerName + " is " + player.getBowlingAverage());
        System.out.println("And " + playerName + " plays as " + playerType);
        System.out.println("\n########################################################\n");
    }
}
