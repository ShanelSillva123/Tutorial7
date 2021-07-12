
public class Player {
    private String playerName;
    private int age;
    private String type;
    private int runsScored;
    private int wicketsTaken;

    public Player(String playerName, int age, String type, int runsScored, int wicketsTaken) {
        this.playerName = playerName;
        this.age = age;
        this.type = type;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    public String getType() {
        return type;
    }
    public double getBattingAverage() {
        double battingAverage =  runsScored / 15;
        return battingAverage;
    }
    public double getBowlingAverage() {
        double bowlingAverage = wicketsTaken / 15;
        return bowlingAverage;
    }
}
