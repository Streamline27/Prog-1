package Chess.Figure;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.1.2
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */
abstract public class Figure implements Movable {
    private byte X;
    private byte Y;

    public Figure(){}

    public Figure(byte X, byte Y)
    {
        this.X = X;
        this.Y = Y;
    }
}