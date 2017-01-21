package model;

/**
 * Created by chenlei on 2017/1/6.
 * 棋盘
 */
public class CheckerBoard {

    private Piece[][] pieces= new Piece[15][15];

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }


}
