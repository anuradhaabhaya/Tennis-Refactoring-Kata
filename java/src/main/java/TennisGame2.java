
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

        if (P1point == P2point && P1point < 3)
        {
            if (P1point==0)
                return "Love-All";
            if (P1point==1)
                return "Fifteen-All";
            if (P1point==2)
                return "Thirty-All";
        }
        if (P1point==P2point && P1point>=3)
            return "Deuce";
        
        if (P1point > 0 && P2point==0)
        {
            return getPlayerResult(P1point) + "-" + getPlayerResult(0);
        }
        if (P2point > 0 && P1point==0)
        {
            return getPlayerResult(0) + "-" + getPlayerResult(P2point);
        }
        
        if ((P1point>P2point && P1point < 4) || (P2point>P1point && P2point < 4))
        {
            return getPlayerResult(P1point) + "-" + getPlayerResult(P2point);
        }
        return score;
    }

    private String getPlayerResult(int playerPoint) {
        String p2res = "";
        if (playerPoint == 0)
            p2res ="Love";
        if (playerPoint == 1)
            p2res ="Fifteen";
        if (playerPoint == 2)
            p2res ="Thirty";
        if (playerPoint == 3)
            p2res ="Forty";
        return p2res;
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