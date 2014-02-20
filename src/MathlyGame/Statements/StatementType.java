package MathlyGame.Statements;

/**
 * Created by AZAEL on 2/20/14.
 */
public enum StatementType
{
    DIVIDE(4),
    MULTIPLY(3),
    MINUS(2),
    PLUS(1);

    private int score;

    StatementType(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }
}
