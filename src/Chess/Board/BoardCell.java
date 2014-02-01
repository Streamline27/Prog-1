package Chess.Board;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.1.2
 * Time: 12:09
 * To change this template use File | Settings | File Templates.
 */
public class BoardCell {
    public static enum CellColor {BLACK, WHITE};
    public CellColor currentCellColor;

    public byte CellPosition;

    public BoardCell(byte position)
    {
        if (position % 2 == 0)
            this.currentCellColor = CellColor.BLACK;
        else
            this.currentCellColor = CellColor.WHITE;

        this.CellPosition = position;
    }
}
