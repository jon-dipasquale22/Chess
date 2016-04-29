package BoardAndPiecesController;

import java.awt.Point;
import java.util.ArrayList;

import ChessPieces.EnumsClass.chessPieceColor;

public class KnightHandler extends PieceHandler {


	public KnightHandler(){
		possibleMoves = new ArrayList<Point>();
	}

	@Override
	void generatePieceMovementsList(chessPieceColor pc) {
		//North 1, east 2
		int i = x;
		int j = y;
		i--;
		j = j+2;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//North 1, west 2
		i = x;
		j = y;
		i--;
		j = j-2;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//North 2, west 1
		i = x;
		j = y;
		i = i-2;
		j = j-1;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}
		//North 2, east 1
		i = x;
		j = y;
		i = i-2;
		j = j+1;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		
		
		
		
		//South 1, east 2
		i = x;
		j = y;
		i++;
		j = j+2;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//South 1, west 2
		i = x;
		j = y;
		i++;
		j = j-2;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//South 2, west 1
		i = x;
		j = y;
		i = i+2;
		j = j-1;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}
		//South 2, east 1
		i = x;
		j = y;
		i = i+2;
		j = j+1;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}



	}
}
