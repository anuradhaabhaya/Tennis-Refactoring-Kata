
public class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    public TennisGame2() {
    }

    public String getScore() {
        if (P1point == P2point) {
            return getEqualityResult();
        }
        if (P1point < 4 && P2point < 4) {
            return getPlayerScore(P1point) + "-" + getPlayerScore(P2point);
        }

        return getLeadingScore();
    }

    private String getLeadingScore() {
        if (isP1LeadingForWin() && hasScoresGapOfTwo()) {
            return "Win for player1";
        }
        if (isP2LeadingForWin() && hasScoresGapOfTwo()) {
            return "Win for player2";
        }
        if (isP1LeadingForAdvantage()) {
            return "Advantage player1";
        }
        return "Advantage player2";
    }

    private boolean isP1LeadingForWin() {
        return P1point > P2point && P1point >= 4;
    }

    private boolean isP2LeadingForWin() {
        return P2point > P1point && P2point >= 4;
    }

    private boolean isP1LeadingForAdvantage() {
        return P1point > P2point && P2point >= 3;
    }

    private boolean hasScoresGapOfTwo() {
        return Math.abs(P1point - P2point) >= 2;
    }

    private String getEqualityResult() {
        if (P1point == 0) {
            return "Love-All";
        }
        if (P1point == 1) {
            return "Fifteen-All";
        }
        if (P1point == 2) {
            return "Thirty-All";
        }
        return "Deuce";
    }

    private String getPlayerScore(int playerPoint) {
        if (playerPoint == 0) {
            return "Love";
        }
        if (playerPoint == 1) {
            return "Fifteen";
        }
        if (playerPoint == 2) {
            return "Thirty";
        }
        return "Forty";
    }

    public void wonPoint(String player) {
        if ("player1".equals(player)) {
            P1point++;
        } else {
            P2point++;
        }
    }
}