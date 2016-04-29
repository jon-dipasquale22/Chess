package BoardAndPiecesController;

import java.awt.Point;
import java.util.ArrayList;

import ChessPieces.EnumsClass.chessPieceColor;

public class BishopHandler extends PieceHandler{


	public BishopHandler(){
		possibleMoves = new <Point>ArrayList();
	}

	@Override
	void generatePieceMovementsList(chessPieceColor pc) {
		//check Southeast of Brook
		boolean lastMoveIsLegal = true;
		int i = x;
		int j = y;
		while(lastMoveIsLegal){
			i++;
			j++;
			if((i< 8 && j < 8) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
					chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
				possibleMoves.add(new Point(i,j));
				if(chessBoardSquares[i][j].getPieceOnTile() != null){
					lastMoveIsLegal = false;
				}
			}else{
				lastMoveIsLegal = false;
			}
		}

		//check Southwest of Brook
		lastMoveIsLegal = true;
		i = x;
		j = y;
		while(lastMoveIsLegal){
			i++;
			j--;
			if((i< 8 && j > -1) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
					chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
				possibleMoves.add(new Point(i,j));
				if(chessBoardSquares[i][j].getPieceOnTile() != null){
					lastMoveIsLegal = false;
				}
			}else{
				lastMoveIsLegal = false;
			}
		}

		//check Northwest of Brook
		lastMoveIsLegal = true;
		i = x;
		j = y;
		while(lastMoveIsLegal){
			i--;
			j--;
			if((i > -1 && j > -1) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
					chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
				possibleMoves.add(new Point(i,j));
				if(chessBoardSquares[i][j].getPieceOnTile() != null){
					lastMoveIsLegal = false;
				}
			}else{
				lastMoveIsLegal = false;
			}
		}

		//check Northeast of Brook
		lastMoveIsLegal = true;
		i = x;
		j = y;
		while(lastMoveIsLegal){
			i--;
			j++;
			if((i > -1 && j < 8) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
					chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
				possibleMoves.add(new Point(i,j));
				if(chessBoardSquares[i][j].getPieceOnTile() != null){
					lastMoveIsLegal = false;
				}
			}else{
				lastMoveIsLegal = false;
			}
		}

	}


}
