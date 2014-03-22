package CollectionTest;

import CollectionTest.Figures.Figure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.22.3
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */

public class Board {
    Map<Coord, Figure> field;

    public Board(){
        field = new HashMap<Coord, Figure>();
    }

    public void Put(int x, int y, Figure figure){
       field.put(new Coord(x, y), figure);
    }

}
