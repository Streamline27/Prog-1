package CollectionTest;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.22.3
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public class Coord {
    private int x, y;

    public Coord(int x ,int y){
       this.x=x;
       this.y=y;
    }

    public void setCoord(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
