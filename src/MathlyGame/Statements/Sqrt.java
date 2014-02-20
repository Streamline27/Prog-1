package MathlyGame.Statements;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Sqrt extends Statement
{
    @Override
    public void showStatement()
    {
        System.out.print("SQRT(" + getX() + ") = ");
    }
}
