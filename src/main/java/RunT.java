import model.Piece;
import model.Type;
import service.Service;

/**
 * Created by chenlei on 2017/1/6.
 */
public class RunT {
    public static void main(String[] agrs){
        Piece[][] checkerBoard=new Piece[15][15];       //构建棋盘
        Type win=null;
        int[] xy = new int[2];

        //走棋
        for(int k=0;k<1;k++){
            //判断当前形势，并反馈
            int[] rxy=Service.analysis(checkerBoard);
            //根据analysis的反馈，决策落子点
            xy[0]=rxy[0];
            xy[1]=rxy[1];
//            //落子
            checkerBoard=Service.runPiece(checkerBoard,new Piece(Type.BLACK,xy));
            for(int i=0;i<checkerBoard.length;i++){
                for(int j=0;j<checkerBoard[i].length;j++){
                    System.out.print(checkerBoard[i][j]+"  ");
                }
                System.out.println();
            }
//            if(win!=null){
//                break;
//            }
        }
    }
}
