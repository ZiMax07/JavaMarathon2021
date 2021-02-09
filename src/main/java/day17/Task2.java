package day17;

public class Task2 {
    public static void main(String[] args) {

        char[][] arrayChess = new char[][]{
                {ChessPiece.ROOK_BLACK.getFigure(), ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),
                        ChessPiece.EMPTY.getFigure(),ChessPiece.ROOK_BLACK.getFigure(), ChessPiece.KING_BLACK.getFigure(),ChessPiece.EMPTY.getFigure()},
                {ChessPiece.EMPTY.getFigure(),ChessPiece.ROOK_WHITE.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),
                        ChessPiece.PAWN_BLACK.getFigure(),ChessPiece.PAWN_BLACK.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.PAWN_BLACK.getFigure()},
                {ChessPiece.PAWN_BLACK.getFigure(),ChessPiece.EMPTY.getFigure(), ChessPiece.KNIGHT_BLACK.getFigure(),ChessPiece.EMPTY.getFigure(),
                        ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.PAWN_BLACK.getFigure(),ChessPiece.EMPTY.getFigure()},
                {ChessPiece.QUEEN_BLACK.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.BISHOP_WHITE.getFigure(),
                        ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure()},
                {ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.BISHOP_BLACK.getFigure(),
                        ChessPiece.PAWN_WHITE.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure()},
                {ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),
                        ChessPiece.BISHOP_WHITE.getFigure(),ChessPiece.PAWN_WHITE.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure()},
                {ChessPiece.PAWN_WHITE.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.QUEEN_WHITE.getFigure(),
                        ChessPiece.EMPTY.getFigure(),ChessPiece.PAWN_WHITE.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.PAWN_WHITE.getFigure()},
                {ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),ChessPiece.EMPTY.getFigure(),
                        ChessPiece.EMPTY.getFigure(),ChessPiece.ROOK_WHITE.getFigure(),ChessPiece.KING_WHITE.getFigure(),ChessPiece.EMPTY.getFigure()}};

        ChessBoard chessBoard = new ChessBoard(arrayChess);
        ChessBoard.print();

        // Если будет большой массив, то лучше создавать пустой массив, заполнить его циклом со значением EMPTY и по индексу расставить фигуры
    }
}
