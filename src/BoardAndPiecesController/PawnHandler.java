package BoardAndPiecesController;

import BoardGUI.BoardFrame;
import ChessPieces.Pawn;
import ChessPieces.Tile;
import ChessPieces.EnumsClass.chessPieceColor;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class PawnHandler extends PieceHandler {

	

	public PawnHandler() {

		possibleMoves = new ArrayList<Point>();

	}

	protected void generateBlacksMovements(){
		try{
			if(chessBoardSquares[x+1][y].getPieceOnTile() == null &&
					chessBoardSquares[x+2][y].getPieceOnTile() == null &&
					(((Pawn) chessBoardSquares[x][y].getPieceOnTile()).getHasMadeFirstMove() == false )){
				possibleMoves.add(new Point(x+1,y));
				possibleMoves.add(new Point(x+2,y));

			}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Possible move is out of bounds");
			}

		try{
			if(chessBoardSquares[x+1][y].getPieceOnTile() == null){
				possibleMoves.add(new Point(x+1,y));
			}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Possible move is out of bounds");
			}

		try{
			if((chessBoardSquares[x+1][y-1].getPieceOnTile() != null) && 
					(chessBoardSquares[x+1][y-1].getPieceOnTile().getPieceColor() == chessPieceColor.WHITE)){
				possibleMoves.add(new Point(x+1,y-1));
			}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Possible move is out of bounds");
			}
		try{
			if((chessBoardSquares[x+1][y+1].getPieceOnTile() != null) &&
					(chessBoardSquares[x+1][y+1].getPieceOnTile().getPieceColor() == chessPieceColor.WHITE)){
				possibleMoves.add(new Point(x+1,y+1));
			}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Possible move is out of bounds");
			}


	}

	protected void generateWhitesMovements(){
		try{
			if(chessBoardSquares[x-1][y].getPieceOnTile() == null &&
					chessBoardSquares[x-2][y].getPieceOnTile() == null &&
					(((Pawn) chessBoardSquares[x][y].getPieceOnTile()).getHasMadeFirstMove() == false )){
				possibleMoves.add(new Point(x-1,y));
				possibleMoves.add(new Point(x-2,y));


			}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Possible move is out of bounds");
			}

		try{
			if(chessBoardSquares[x-1][y].getPieceOnTile() == null){
				possibleMoves.add(new Point(x-1,y));
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Possible move is out of bounds");
		}		
		try{
			if((chessBoardSquares[x-1][y-1].getPieceOnTile() != null) && 
					(chessBoardSquares[x-1][y-1].getPieceOnTile().getPieceColor() == chessPieceColor.BLACK)){
				possibleMoves.add(new Point(x-1,y-1));
			}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Possible move is out of bounds");
			}

		try{
			if((chessBoardSquares[x-1][y+1].getPieceOnTile() != null) &&
					(chessBoardSquares[x-1][y+1].getPieceOnTile().getPieceColor() == chessPieceColor.BLACK)){
				possibleMoves.add(new Point(x-1,y+1));
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Possible move is out of bounds");
		}



	}






	@Override
	void generatePieceMovementsList(chessPieceColor pc) {
		if(pc == chessPieceColor.BLACK)
			generateWhitesMovements();
		else
			generateBlacksMovements();
	}









}
