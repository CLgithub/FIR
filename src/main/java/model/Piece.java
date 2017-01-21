package model;

/**
 * Created by chenlei on 2017/1/6.
 * 棋子
 */
public class Piece {
    private Type type;
    private int[] xy;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int[] getXy() {
        return xy;
    }

    public void setXy(int[] xy) {
        this.xy = xy;
    }

    public Piece(Type type, int[] xy) {
        this.type = type;
        this.xy = xy;
    }

    public Piece() {
    }

    @Override
    public String toString() {
        return  type.toString();
    }
}
