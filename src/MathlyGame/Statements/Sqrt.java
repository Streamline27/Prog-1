package MathlyGame.Statements;

import MathlyGame.Game;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Sqrt extends Statement
{
    public Sqrt()
    {
        score = Game.getHardness().getRatio() * StatementType.SQRT.getScore();
        x = randomNumber(1, 20);
        result = x;
        x *= x;
    }

    @Override
    public void showStatement()
    {
        System.out.print("SQRT(" + getX() + ") = ");
    }
}
