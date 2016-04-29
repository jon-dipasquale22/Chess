package BoardAndPiecesController;

import java.awt.Point;
import java.util.ArrayList;

import ChessPieces.EnumsClass.chessPieceColor;

public class KingHandler extends PieceHandler {


	public KingHandler(){
		possibleMoves = new ArrayList<Point>();
	}

	@Override
	void generatePieceMovementsList(chessPieceColor pc) {

		//North 1
		int i = x;
		int j = y;
		i--;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//North 1, east 1
		i = x;
		j = y;
		i--;
		j++;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//North 1, West 1
		i = x;
		j = y;
		i--;
		j--;
		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//West 1
		i = x;
		j = y;
		j--;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//South 1, West 1
		i = x;
		j = y;
		i++;
		j--;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//South 1
		i = x;
		j = y;
		i++;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//South 1, East 1
		i = x;
		j = y;
		i++;
		j++;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}

		//East 1
		i = x;
		j = y;
		j++;

		if((i< 8 && i >-1 && j < 8 && j >-1) && (chessBoardSquares[i][j].getPieceOnTile() == null ||
				chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc ) ){
			possibleMoves.add(new Point(i,j));
		}



	}
}
