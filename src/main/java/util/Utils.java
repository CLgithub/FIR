package util;

import model.Piece;

/**
 * Created by chenlei on 2017/1/9.
 */
public class Utils {
    public static void printlnArray(Piece[][] pieces){
        for(int i=0;i<pieces.length;i++){
            for(int j=0;j<pieces[i].length;j++){
                System.out.print(pieces[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
