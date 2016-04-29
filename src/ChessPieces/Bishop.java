package ChessPieces;

import javax.swing.ImageIcon;

import ChessPieces.EnumsClass.chessPieceColor;

public class Bishop extends SuperPiece{

	
	public Bishop(chessPieceColor pc){
		super();
		pieceColor = pc;
		if(pieceColor == chessPieceColor.BLACK){
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("BishopBlack.png"));
			
		}else{
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("BishopWhite.png"));
		}
	}
	
	
	@Override
	public void checkIfMoveIsLegal() {
		// TODO Auto-generated method stub
		
	}

	
	
}
