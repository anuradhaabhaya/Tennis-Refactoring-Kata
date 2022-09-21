package game1;

public class ScoreUtils {
    public static String buildScore(int player1Score, int player2Score) {
        return getMatchingTennisScore(player1Score) + "-" + getMatchingTennisScore(player2Score);
    }

    public static String getLeadingScore(Player player1, Player player2) {
        Player leader = player1.getScore() > player2.getScore() ? player1 : player2;
        int scoreGap = Math.abs(player1.getScore() - player2.getScore());

        if (scoreGap == 1) {
            return "Advantage " + leader.getName();
        }
        return "Win for " + leader.getName();
    }

    public static String getEqualityScore(int playersScore) {
        if (playersScore == 0) {
            return "Love-All";
        }
        if (playersScore == 1) {
            return "Fifteen-All";
        }
        if (playersScore == 2) {
            return "Thirty-All";
        }
        return "Deuce";
    }

    private static String getMatchingTennisScore(int score) {
        if (score == 0) {
            return "Love";
        }
        if (score == 1) {
            return "Fifteen";
        }
        if (score == 2) {
            return "Thirty";
        }
        return "Forty";
    }
}
