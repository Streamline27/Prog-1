package Chess.Board;

import Chess.Figure.*;
import Chess.Figure.FigureTypes.*;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.1.2
 * Time: 12:08
 * To change this template use File | Settings | File Templates.
 */
public class Board {
    public Figure[] WhiteFigures = new Figure[16];
    public Figure[] BlackFigures = new Figure[16];
    public BoardCell[][] BoardCells = new BoardCell[8][8];

    public Board()
    {
        // Making board
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++) {
                BoardCells[i][j] = new BoardCell((byte)i, (byte)j);
            }
        }

//      Fill White Figures
//      Fill Pawns
        for (int i = 0; i < 8; i++)
        {
            // WhiteFigures[i] = new Pawn();
        }


    }

}
