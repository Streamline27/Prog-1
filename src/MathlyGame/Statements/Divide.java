package MathlyGame.Statements;

import MathlyGame.Game;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Divide extends Statement
{
    public Divide()
    {
        x = randomNumber(Game.getHardness().getMaxNumb() / 2);
        y = randomNumber(1, Game.getHardness().getMaxNumb() / 2);

        int resultM = x * y;

        score = Game.getHardness().getRatio() * StatementType.DIVIDE.getScore();
        result = resultM / y;
        x = resultM;
    }

    @Override
    public void showStatement()
    {
        System.out.print(getX() + " / " + getY() + " = ");
    }
}
