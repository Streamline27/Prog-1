package Chess.Board;

import Chess.Figure.Figure;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.1.2
 * Time: 12:09
 * To change this template use File | Settings | File Templates.
 */
public class BoardCell
{
    enum CellColor {BLACK, WHITE};

    private CellColor currentCellColor;

    public byte getX() {
        return X;
    }

    public byte getY() {
        return Y;
    }

    public CellColor getCurrentCellColor() {
        return currentCellColor;
    }

    private byte X;
    private byte Y;

    private Figure CellFigure;

    public BoardCell(byte x, byte y)
    {
        this.X = x;
        this.Y = y;

        if (y % 2 == 1)
        {
            if (x % 2 == 1)
                this.currentCellColor = CellColor.BLACK;
            else
                this.currentCellColor = CellColor.WHITE;
        }
        else
        {
            if (x % 2 == 1)
                this.currentCellColor = CellColor.WHITE;
            else
                this.currentCellColor = CellColor.BLACK;
        }
    }

    public BoardCell(byte x, byte y, Figure CellFigure)
    {
        this(x, y);
        this.CellFigure = CellFigure;
    }

    public void placeFigure(Figure fig)
    {
        if (!isFree())
             return;

        this.CellFigure = fig;
    }

    public boolean isFree()
    {
        if (CellFigure == null)
            return true;
        return false;
    }

}
