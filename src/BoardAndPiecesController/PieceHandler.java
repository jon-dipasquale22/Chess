package BoardAndPiecesController;

import java.awt.Point;
import java.util.ArrayList;

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
import java.awt.Point;

public abstract class PieceHandler extends SuperHandler {

	/*
	 * x Coordinate of pawn Piece
	 */
	protected int x;
	/*
	 * x Coordinate of pawn Piece
	 */
	protected int y;

	protected ArrayList<Point> possibleMoves;

	public PieceHandler(){

	}

	abstract void generatePieceMovementsList(chessPieceColor pc);

	protected void generateAllLegalMoves(int xLoc, int yLoc) {
		possibleMoves.clear();
		x = xLoc;
		y = yLoc;

		if(chessBoardSquares[x][y] == null){
			System.out.println("X: " + x + " Y: " + y);
		}

		if(chessBoardSquares[x][y].getPieceOnTile().getPieceColor() == chessPieceColor.BLACK){
			generatePieceMovementsList(chessPieceColor.WHITE);
		}else{
			generatePieceMovementsList(chessPieceColor.BLACK);
		}
		eliminateAllMovmentsOutOfBounds(possibleMoves);


	}

	protected void showAllLegalMoves(){
		for(int i = 0; i < possibleMoves.size(); i++){
			chessBoardSquares[(int) possibleMoves.get(i).getX()][(int) possibleMoves.get(i).getY()].setBorder(border);
			chessBoardSquares[(int) possibleMoves.get(i).getX()][(int) possibleMoves.get(i).getY()].setHasBorder(true);

			System.out.println("X: " + possibleMoves.get(i).getX() + " Y: " + possibleMoves.get(i).getY());
		}
	}

	protected void eliminateAllMovmentsOutOfBounds(ArrayList<Point> pointList){

		for(int i = 0; i < pointList.size(); i++){
			if(!isInBounds(pointList.get(i))){
				pointList.remove(i);
			}
		}


	}

	/*
	 * returns true if the Point is NOT out of bounds
	 */
	protected boolean isInBounds(Point p){
		if(p.getX() > 7 || p.getX() < 0 || p.getY() > 7 || p.getY() < 0 ){
			return false;
		}else{
			return true;
		}
	}

}
