package game1;

public class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void scores() {
        score += 1;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
