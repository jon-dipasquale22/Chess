package BoardAndPiecesController;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import BoardGUI.BoardFrame;
import ChessPieces.Bishop;
import ChessPieces.Brook;
import ChessPieces.King;
import ChessPieces.Knight;
import ChessPieces.Pawn;
import ChessPieces.Queen;
import ChessPieces.Tile;
import ChessPieces.EnumsClass.chessPieceColor;

public class SuperHandler {

	protected BoardFrame theGameBoard;
	/*
	 * this is a pointer to the actual board where the pieces are on
	 */
	protected static Tile[][] chessBoardSquares;

	/*
	 * This is the first Tile that is clicked
	 */
	protected Tile tileSource;


	/*
	 * 
	 */
	protected chessPieceColor whoseTurn = chessPieceColor.WHITE;
	/*
	 * instance of the pawn controller. this object controls pawn movement and 
	 * show legal pawn moves 
	 */


	protected Border border;

	protected ArrayList<PastMove> pastMovesList;

	public SuperHandler(){
		border = BorderFactory.createLineBorder(Color.BLUE, 5);
		pastMovesList = new ArrayList<PastMove>();
	}



	protected void removeAllBorders(){
		for (int i = 0; i < chessBoardSquares.length; i++) {
			for (int j = 0; j < chessBoardSquares[i].length; j++) {
				chessBoardSquares[i][j].setTileBorderToNull();
				

			}
		}
	}
	protected void updateBoard(){
		theGameBoard.setChessBoardSquare(chessBoardSquares);
		theGameBoard.revalidate();
		theGameBoard.repaint();
	}

	protected void changeWhosTurn(){
		if(whoseTurn == chessPieceColor.BLACK){
			whoseTurn = chessPieceColor.WHITE;
			theGameBoard.setInfoStatusBar("It's White's Turn!");
		}else{
			whoseTurn = chessPieceColor.BLACK;
			theGameBoard.setInfoStatusBar("It's Black's Turn!");
		}
	}

	protected void pieceMovement(Tile dest){

		dest.setPieceToTile(tileSource.getPieceOnTile());
		if(dest.getPieceOnTile() instanceof Pawn){
			((Pawn) dest.getPieceOnTile()).setHasMadeFirstMove(true );
		}
		tileSource.setPieceToNull();
		tileSource = null;
		
	}

	public void setChessBoardSquares(Tile[][] cbs){
		chessBoardSquares = cbs;
	}

	protected void sysPrintChessBoardSquares(){
		System.out.println("ChessBoardSquares");
		for(int i = 0; i < 8; i++){
			for(int j = 0; j<8; j++){

				if(chessBoardSquares[i][j].hasPiece()){
					System.out.print("I");
				}else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	protected void addToList(Tile tileDest){

		PastMove pm = new PastMove(tileSource, tileDest);
		
		if( tileSource.getPieceOnTile() instanceof Pawn){
			if(((Pawn) tileSource.getPieceOnTile()).getHasMadeFirstMove() == false){
				pm.setPawnsLastMovemementWasItsFirst(true);
			}
		}
		
		pastMovesList.add(pm);


		for(int i = 0; i < pastMovesList.size();i++){
			System.out.print("Tile Source (" + pastMovesList.get(i).getTileSourceXCoordinate() + "," + 
					pastMovesList.get(i).getTileSourceYCoordinate() + ")");
			if(tileSource.getPieceOnTile() != null){
				if(tileSource.getPieceOnTile() instanceof Queen){
					System.out.println(" Queen");
				}else if( tileSource.getPieceOnTile() instanceof King){
					System.out.println(" King");
				}else if( tileSource.getPieceOnTile() instanceof Brook){
					System.out.println(" Brook");
				}else if( tileSource.getPieceOnTile() instanceof Knight){
					System.out.println(" Knight");
				}else if( tileSource.getPieceOnTile() instanceof Bishop){
					System.out.println(" Bishop");
				}else if( tileSource.getPieceOnTile() instanceof Pawn){
					System.out.println(" Pawn");
					if(((Pawn) tileSource.getPieceOnTile()).getHasMadeFirstMove() == false){

					}
				}
			}else{
				System.out.println(" Piece is Null");
			}


			System.out.print("Tile Destination (" + pastMovesList.get(i).getTileDestinationXCoordinate() + "," + 
					pastMovesList.get(i).getTileDestinationYCoordinate() + ")");

			if(tileDest.getPieceOnTile() != null){
				if(tileDest.getPieceOnTile() instanceof Queen){
					System.out.println(" Queen");
				}else if( tileDest.getPieceOnTile() instanceof King){
					System.out.println(" King");
				}else if( tileDest.getPieceOnTile() instanceof Brook){
					System.out.println(" Brook");
				}else if( tileDest.getPieceOnTile() instanceof Knight){
					System.out.println(" Knight");
				}else if( tileDest.getPieceOnTile() instanceof Bishop){
					System.out.println(" Bishop");
				}else if( tileDest.getPieceOnTile() instanceof Pawn){
					System.out.println(" Pawn");
				}
			}else{
				System.out.println(" Piece is Null");
			}
		}
	}


}
