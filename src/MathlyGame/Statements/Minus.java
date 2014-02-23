package MathlyGame.Statements;

import MathlyGame.Game;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Minus extends Statement
{
    public Minus()
    {
        x = randomNumber(Game.getHardness().getMaxNumb());
        y = randomNumber(Game.getHardness().getMaxNumb());
        score = Game.getHardness().getRatio() * StatementType.MINUS.getScore();
        result = x - y;
    }

    @Override
    public String getStatement()
    {
        return(getX() + " - " + getY() );
    }
}
