package BoardAndPiecesController;

import java.awt.Point;
import java.util.ArrayList;

import ChessPieces.EnumsClass.chessPieceColor;

public class QueenHandler extends PieceHandler{

	public QueenHandler(){
		possibleMoves = new ArrayList<Point>();
	}





	@Override
	void generatePieceMovementsList(chessPieceColor pc) {
		//check east of Queen
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
		//check west of Queen
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
		//check south of Queen
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


		//check north of Queen
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

		//check Southwest of Queen
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

		//check Northwest of Queen
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

		//check Northeast of Queen
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
		//check Southeast of Queen

		lastMoveIsLegal = true;

		i = x;
		j = y;
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



	}

}
