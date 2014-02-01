package Chess.Board;

import Chess.Figure.*;
import Chess.Figure.FigureTypes.*;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.1.2
 * Time: 12:08
 * To change this template use File | Settings | File Templates.
 */
public class Board {
    public static final byte CellCount = 64;
    public Figure[] WhiteFigures = new Figure[16];
    public Figure[] BlackFigures = new Figure[16];
    public BoardCell[] BoardCells = new BoardCell[CellCount];

    public Board()
    {
        // Fill white figure Arrays
        for (byte counter = 0; counter < 8; ++counter)
            WhiteFigures[counter] = new Pawn();
        for (byte counter = 8; counter < 10; ++counter)
            WhiteFigures[counter] = new Rook();
        for (byte counter = 10; counter < 12; ++counter)
            WhiteFigures[counter] = new Bishop();
        for (byte counter = 12; counter < 14; ++counter)
            WhiteFigures[counter] = new Knight();
        WhiteFigures[15] = new King();
        WhiteFigures[16] = new Queen();

        // Fill black figure Arrays
        for (byte counter = 0; counter < 8; ++counter)
            BlackFigures[counter] = new Pawn();
        for (byte counter = 8; counter < 10; ++counter)
            BlackFigures[counter] = new Rook();
        for (byte counter = 10; counter < 12; ++counter)
            BlackFigures[counter] = new Bishop();
        for (byte counter = 12; counter < 14; ++counter)
            BlackFigures[counter] = new Knight();
        BlackFigures[15] = new King();
        BlackFigures[16] = new Queen();

        // Making board
        for (int i = 0; i < CellCount; ++i)
            BoardCells[i] = new BoardCell((byte)i);

    }

}
