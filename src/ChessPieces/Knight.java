package ChessPieces;

import javax.swing.ImageIcon;

import ChessPieces.EnumsClass.chessPieceColor;

public class Knight extends SuperPiece {

	
	public Knight(chessPieceColor pc){
		super();
		pieceColor = pc;
		if(pieceColor == chessPieceColor.BLACK){
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("KnightBlack.png"));
			
		}else{
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("KnightWhite.png"));
		}
	}
	
	
	@Override
	public void checkIfMoveIsLegal() {
		// TODO Auto-generated method stub
		
	}

}
