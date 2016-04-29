package BoardAndPiecesController;

import java.awt.Point;
import java.util.ArrayList;

import ChessPieces.EnumsClass.chessPieceColor;

public class BrookHandler extends PieceHandler{


	public BrookHandler(){
		possibleMoves = new <Point>ArrayList();
	}


	@Override
	void generatePieceMovementsList(chessPieceColor pc) {
		//check east of Brook
				boolean lastMoveIsLegal = true;
				int i = x;
				int j = y;
				while(lastMoveIsLegal){
					i++;
					if((i < 8 ) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
							chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
						possibleMoves.add(new Point(i,j));
						if(chessBoardSquares[i][j].getPieceOnTile() != null){
							lastMoveIsLegal = false;
						}
					}else{
						lastMoveIsLegal = false;
					}
				}
				//check west of Brook
				lastMoveIsLegal = true;
				i = x;
				j = y;
				while(lastMoveIsLegal){
					i--;
					if((i > -1 ) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
							chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
						possibleMoves.add(new Point(i,j));		
						if(chessBoardSquares[i][j].getPieceOnTile() != null){
							lastMoveIsLegal = false;
						}
					}else{
						lastMoveIsLegal = false;
					}



				}
				//check south of Brook
				lastMoveIsLegal = true;
				i = x;
				j = y;
				while(lastMoveIsLegal){
					j++;
					if((j < 8 ) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
							chessBoardSquares[i][j].getPieceOnTile().getPieceColor() == pc)){
						possibleMoves.add(new Point(i,j));	
						if(chessBoardSquares[i][j].getPieceOnTile() != null){
							lastMoveIsLegal = false;
						}
					}else{
						lastMoveIsLegal = false;
					}
				}


				//check north of Brook
				lastMoveIsLegal = true;
				i = x;
				j = y;
				while(lastMoveIsLegal){
					j--;
					if((j > -1 ) && (chessBoardSquares[i][j].getPieceOnTile() == null || 
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
