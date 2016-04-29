package BoardAndPiecesController;

import BoardGUI.BoardFrame;
import ChessPieces.Bishop;
import ChessPieces.Brook;
import ChessPieces.King;
import ChessPieces.Knight;
import ChessPieces.Pawn;
import ChessPieces.Queen;
import ChessPieces.Tile;
import ChessPieces.EnumsClass.chessPieceColor;

public class MovePiecesToStartingPositions {
	
	
	private Tile[][] chessBoardSquares;
	public MovePiecesToStartingPositions(Tile[][] cbs){
		chessBoardSquares = cbs;
		movePiecesToStartingPosition();
	}
	private void movePiecesToStartingPosition(){
		blackBrooksToStartPosition();
		blackKnightsToStartPosition();
		blackBishopsToStartPosition();
		blackKingToStartPosition();
		blackPawnsToStartPosition();
		blackQueenToStartPosition();

		whiteBrooksToStartPosition();
		whiteKnightsToStartPosition();
		whiteBishopsToStartPosition();
		whiteKingToStartPosition();
		whitePawnsToStartPosition();
		whiteQueenToStartPosition();


	}

	private void blackBrooksToStartPosition(){

		Brook b = new Brook(chessPieceColor.BLACK);
		chessBoardSquares[0][0].setPieceToTile(b);
		Brook bb = new Brook(chessPieceColor.BLACK);
		chessBoardSquares[0][7].setPieceToTile(b);

	}
	private void blackKnightsToStartPosition(){
		Knight k = new Knight(chessPieceColor.BLACK);
		chessBoardSquares[0][1].setPieceToTile(k);
		Knight kk = new Knight(chessPieceColor.BLACK);
		chessBoardSquares[0][6].setPieceToTile(kk);

	}
	private void blackBishopsToStartPosition(){
		Bishop b = new Bishop(chessPieceColor.BLACK);
		chessBoardSquares[0][2].setPieceToTile(b);
		Bishop bb = new Bishop(chessPieceColor.BLACK);
		chessBoardSquares[0][5].setPieceToTile(bb);

	}
	private void blackKingToStartPosition(){
		King k = new King(chessPieceColor.BLACK);
		chessBoardSquares[0][4].setPieceToTile(k);

	}
	private void blackPawnsToStartPosition(){
		Pawn p1 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][0].setPieceToTile(p1);
		Pawn p2 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][1].setPieceToTile(p2);
		Pawn p3 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][2].setPieceToTile(p3);
		Pawn p4 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][3].setPieceToTile(p4);
		Pawn p5 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][4].setPieceToTile(p5);
		Pawn p6 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][5].setPieceToTile(p6);
		Pawn p7 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][6].setPieceToTile(p7);
		Pawn p8 = new Pawn(chessPieceColor.BLACK);
		chessBoardSquares[1][7].setPieceToTile(p8);
	}
	private void blackQueenToStartPosition(){
		Queen q = new Queen(chessPieceColor.BLACK);
		chessBoardSquares[0][3].setPieceToTile(q);

	}

	private void whiteBrooksToStartPosition(){
		Brook b = new Brook(chessPieceColor.WHITE);
		chessBoardSquares[7][0].setPieceToTile(b);
		Brook bb = new Brook(chessPieceColor.WHITE);
		chessBoardSquares[7][7].setPieceToTile(b);

	}
	private void whiteKnightsToStartPosition(){
		Knight k = new Knight(chessPieceColor.WHITE);
		chessBoardSquares[7][1].setPieceToTile(k);
		Knight kk = new Knight(chessPieceColor.WHITE);
		chessBoardSquares[7][6].setPieceToTile(kk);

	}
	private void whiteBishopsToStartPosition(){
		Bishop b = new Bishop(chessPieceColor.WHITE);
		chessBoardSquares[7][2].setPieceToTile(b);
		Bishop bb = new Bishop(chessPieceColor.WHITE);
		chessBoardSquares[7][5].setPieceToTile(bb);

	}
	private void whiteKingToStartPosition(){
		King k = new King(chessPieceColor.WHITE);
		chessBoardSquares[7][4].setPieceToTile(k);

	}
	private void whitePawnsToStartPosition(){
		Pawn p1 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][0].setPieceToTile(p1);
		Pawn p2 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][1].setPieceToTile(p2);
		Pawn p3 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][2].setPieceToTile(p3);
		Pawn p4 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][3].setPieceToTile(p4);
		Pawn p5 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][4].setPieceToTile(p5);
		Pawn p6 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][5].setPieceToTile(p6);
		Pawn p7 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][6].setPieceToTile(p7);
		Pawn p8 = new Pawn(chessPieceColor.WHITE);
		chessBoardSquares[6][7].setPieceToTile(p8);
	}
	private void whiteQueenToStartPosition(){
		Queen q = new Queen(chessPieceColor.WHITE);
		chessBoardSquares[7][3].setPieceToTile(q);

	}
}
