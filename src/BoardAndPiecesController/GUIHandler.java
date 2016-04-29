package BoardAndPiecesController;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import BoardGUI.BoardFrame;
import ChessPieces.Bishop;
import ChessPieces.Brook;
import ChessPieces.EnumsClass.chessPieceColor;
import ChessPieces.King;
import ChessPieces.Knight;
import ChessPieces.Pawn;
import ChessPieces.Queen;
import ChessPieces.SuperPiece;
import ChessPieces.Tile;


/*
 * This class handles controls 
 */


public class GUIHandler extends SuperHandler{


	private PawnHandler pawnHandler;
	private BrookHandler brookHandler;
	private BishopHandler bishopHandler;
	private KnightHandler knightHandler;
	private QueenHandler queenHandler;
	private KingHandler kingHandler;
	private Stack<Tile[][]> historyStack;


	public GUIHandler(BoardFrame b){
		theGameBoard = new BoardFrame(this);
		theGameBoard.createBoard();
		pawnHandler = new PawnHandler();
		brookHandler = new BrookHandler();
		bishopHandler = new BishopHandler();
		knightHandler = new KnightHandler();
		queenHandler = new QueenHandler();
		kingHandler = new KingHandler();
		chessBoardSquares = theGameBoard.getChessBoard();
		MovePiecesToStartingPositions mptsp = new MovePiecesToStartingPositions(chessBoardSquares);
		historyStack = new Stack<Tile[][]>();

	}






	/*
	 * This method is invoked whenever a mouse click action occurs
	 * on a tile. It determines if another tile has already been clicked (Meaning it would 
	 * have a border around its tile). If another tile has already been clicked it then determines
	 * if the tile that was just clicked is a legal move.  
	 */

	public void boardSquareAction(Tile t){


		System.out.println("ActionRecieved for point (" + t.getBoardLocation().getX() + "," + t.getBoardLocation().getY() + ")");



		if(tileSource == null && t.getPieceOnTile() != null &&  t.getPieceOnTile().getPieceColor() == whoseTurn){
			tileSource = t;
			t.setTileBorder(border);
			int x = (int)tileSource.getBoardLocation().getX();
			int y = (int) tileSource.getBoardLocation().getY();
			if (tileSource.getPieceOnTile() instanceof Pawn){
				pawnHandler.generateAllLegalMoves(x,y);
				pawnHandler.showAllLegalMoves();

			}else if(tileSource.getPieceOnTile()  instanceof Queen){
				queenHandler.generateAllLegalMoves(x,y);
				queenHandler.showAllLegalMoves();

			}else if( tileSource.getPieceOnTile()  instanceof King){
				kingHandler.generateAllLegalMoves(x,y);
				kingHandler.showAllLegalMoves();
			}else if( tileSource.getPieceOnTile()  instanceof Brook){
				brookHandler.generateAllLegalMoves(x,y);
				brookHandler.showAllLegalMoves();
			}else if( tileSource.getPieceOnTile()  instanceof Knight){
				knightHandler.generateAllLegalMoves(x,y);
				knightHandler.showAllLegalMoves();

			}else if( tileSource.getPieceOnTile()  instanceof Bishop){
				bishopHandler.generateAllLegalMoves(x,y);
				bishopHandler.showAllLegalMoves();
			}

			tileSource = t;
			System.out.println("Display Legal Moves \n");
			//Same Tile is Clicked Twice, So board is removed
		}else if( tileSource != null && tileSource.getBoardLocation().getX() == t.getBoardLocation().getX() && 
				tileSource.getBoardLocation().getY() == t.getBoardLocation().getY()  ){
			removeAllBorders();	
			System.out.println("Same Tile Clicked \n");
			tileSource = null;
		}else if(t.getHasBorder()) {
			System.out.println("Piece Movement \n");
			addToList(t);
			pieceMovement(t);
			removeAllBorders();
			changeWhosTurn();
			sysPrintChessBoardSquares();


		}
		updateBoard();

	}

	public void undoAction(){
		
		if(pastMovesList.size() >= 1){
			System.out.println("***New Undo***");
			System.out.println("Size of history List " + pastMovesList.size());
			PastMove temp = pastMovesList.get(pastMovesList.size()-1);
			int sourceX = temp.getTileSourceXCoordinate();
			int sourceY = temp.getTileSourceYCoordinate();
			int destX = temp.getTileDestinationXCoordinate();
			int destY = temp.getTileDestinationYCoordinate();
			System.out.println("s(" + sourceX +","+sourceY+")" );
			System.out.println("d(" + destX +","+destY+")" );

			chessBoardSquares[sourceX][sourceY].setPieceToTile(temp.getSourcePiece());
			if((temp.getSourcePiece() instanceof Pawn )&&(temp.getPawnsLastMovemementWasItsFirst())){
				chessBoardSquares[sourceX][sourceY].setPieceToTile(temp.getSourcePiece());
				((Pawn) chessBoardSquares[sourceX][sourceY].getPieceOnTile()).setHasMadeFirstMove(false);
			}else{
				chessBoardSquares[sourceX][sourceY].setPieceToTile(temp.getSourcePiece());
			}

			if(temp.getDestinationPiece() == null){
				chessBoardSquares[destX][destY].setPieceToNull();	
			}else{
				chessBoardSquares[destX][destY].setPieceToTile(temp.getDestinationPiece());
			}

			pastMovesList.remove(pastMovesList.size()-1);
			changeWhosTurn();

		}
	}

	public void resetGameBoard(){
		System.out.println("To mouseRelease event");
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				chessBoardSquares[i][j] = new Tile(new Point(i,j));
			}
		}
		MovePiecesToStartingPositions mptsp = new MovePiecesToStartingPositions(chessBoardSquares);
		updateBoard();
	}



}
