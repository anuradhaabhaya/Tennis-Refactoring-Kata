import game1.Player;
import game1.ScoreUtils;

public class TennisGame1 implements TennisGame {
    private final Player player1;
    private final Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (isPlayer1(playerName)) {
            player1.scores();
        }
        else {
            player2.scores();
        }
    }

    public String getScore() {
        if (hasEqualScores()) {
            return ScoreUtils.getEqualityScore(player1.getScore());
        }
        if (hasLeadingPlayer()) {
            return ScoreUtils.getLeadingScore(player1, player2);
        }
        return ScoreUtils.buildScore(player1.getScore(), player2.getScore());
    }

    private boolean hasLeadingPlayer() {
        return player1.getScore() >= 4 || player2.getScore() >= 4;
    }

    private boolean hasEqualScores() {
        return player1.getScore() == player2.getScore();
    }

    private boolean isPlayer1(String playerName) {
        return player1.getName().equals(playerName);
    }
}
