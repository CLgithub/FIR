package service;

import model.Piece;

/**
 * Created by chenlei on 2017/1/6.
 */
public class Service {

    /**
     * 落子
     * @param checkerBoard 当前棋盘
     * @param piece 棋子
     * @return 落子后的棋盘
     */
    public static Piece[][] runPiece(Piece[][] checkerBoard, Piece piece){
        if(checkerBoard[piece.getXy()[0]][piece.getXy()[1]]==null){
            checkerBoard[piece.getXy()[0]][piece.getXy()[1]]=piece;
            return checkerBoard;
        }
        return checkerBoard;
    }


    /**
     * 判断当前形势，并反馈
     * @param checkerBoard
     */
    public static int[] analysis(Piece[][] checkerBoard) {
        for(int i=0;i<checkerBoard.length;i++){
            for(int j=0;j<checkerBoard[i].length;j++){
               System.out.print(checkerBoard[i][j]+"  ");
            }
            System.out.println();
        }
        return new int[]{7,7};
    }
}
