package MathlyGame.Statements;

import MathlyGame.Game;
import java.util.Random;

/**
 * Created by AZAEL on 2/20/14.
 */
public abstract class Statement
{
    protected int result;
    protected int score;
    protected int x, y;

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getScore()
    {
        return score;
    }

    public int getResult()
    {
        return result;
    }

    protected Statement()
    {
    }

    protected int randomNumber(int max)
    {
        Random r = new Random();
        return r.nextInt(max + 1);
    }

    public abstract void showStatement();
}
