package Chess.Board;

import Chess.Figure.*;
import Chess.Figure.FigureTypes.Pawn;

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

    public Board()
    {
        // Fill white figure

        for (int i = 0; i < 8; ++i)
            WhiteFigures[i] = new Pawn();



        // Fill black figure Arrays

    }

}
