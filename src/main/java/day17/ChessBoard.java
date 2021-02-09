package day17;

public class ChessBoard {

    private static char[][] chessPieces;

    public ChessBoard(char[][] chessPieces){
        this.chessPieces = chessPieces;
    }

    public static void print(){
        for(int i = 0; i < chessPieces.length; i++){
            for (int j = 0; j < chessPieces[i].length; j++){
                System.out.print(chessPieces[i][j]);
            }
            System.out.println(); 
        }
    }
}
