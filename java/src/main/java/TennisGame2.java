
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;

    public TennisGame2(String player1Name, String player2Name) {
    }

    public String getScore()
    {
        String score = "";

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            return "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            return "Win for player2";
        }
        if (P1point > P2point && P2point >= 3)
        {
            return "Advantage player1";
        }
        if (P2point > P1point && P1point >= 3)
        {
            return "Advantage player2";
        }

        if (P1point == P2point) {
            return getEqualityResult();
        }
        
        if ((P1point>P2point && P1point < 4) || (P2point>P1point && P2point < 4)) {
            return getPlayerResult(P1point) + "-" + getPlayerResult(P2point);
        }
        return score;
    }

    private String getEqualityResult() {
        if (P1point==0)
            return "Love-All";
        if (P1point==1)
            return "Fifteen-All";
        if (P1point==2)
            return "Thirty-All";
        return "Deuce";
    }

    private String getPlayerResult(int playerPoint) {
        if (playerPoint == 0)
            return "Love";
        if (playerPoint == 1)
            return "Fifteen";
        if (playerPoint == 2)
            return "Thirty";
        return "Forty";
    }

    public void P1Score()
    {
        P1point++;
    }
    
    public void P2Score()
    {
        P2point++;
    }

    public void wonPoint(String player)
    {
        if ("player1".equals(player))
            P1Score();
        else
            P2Score();
    }
}