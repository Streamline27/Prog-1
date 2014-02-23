package MathlyGame.Statements;

import MathlyGame.Game;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Plus extends Statement
{
    public Plus()
    {
        x = randomNumber(Game.getHardness().getMaxNumb());
        y = randomNumber(Game.getHardness().getMaxNumb());
        score = Game.getHardness().getRatio() * StatementType.PLUS.getScore();
        result = x + y;
    }

    @Override
    public String getStatement()
    {
        return(getX() + " + " + getY());
    }
}
