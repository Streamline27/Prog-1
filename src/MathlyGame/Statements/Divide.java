package MathlyGame.Statements;

import MathlyGame.Game;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Divide extends Statement
{
    public Divide()
    {
        x = randomNumber(Game.getHardness().getMaxNumb());
        y = randomNumber(Game.getHardness().getMaxNumb());
        score = Game.getHardness().getRatio() * StatementType.DIVIDE.getScore();
        result = x / y;
    }

    @Override
    public void showStatement()
    {
        System.out.print(getX() + " / " + getY() + " = ");
    }
}
