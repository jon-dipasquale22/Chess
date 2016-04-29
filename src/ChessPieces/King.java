package ChessPieces;

import javax.swing.ImageIcon;

import ChessPieces.EnumsClass.chessPieceColor;

public class King extends SuperPiece{
	
	public King(chessPieceColor pc){
		super();
		pieceColor = pc;
		if(pieceColor == chessPieceColor.BLACK){
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("KingBlack.png"));
			
		}else{
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("KingWhite.png"));
		}
	}

	@Override
	public void checkIfMoveIsLegal() {
		// TODO Auto-generated method stub
		
	}

}
