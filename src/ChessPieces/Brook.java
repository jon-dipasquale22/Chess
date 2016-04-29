package ChessPieces;

import javax.swing.ImageIcon;

import ChessPieces.EnumsClass.chessPieceColor;

public class Brook extends SuperPiece{

	public Brook(chessPieceColor pc){
		super();
		pieceColor = pc;
		if(pieceColor == chessPieceColor.BLACK){
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("BrookBlack.png"));
			
		}else{
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("BrookWhite.png"));
		}
	}

	@Override
	public void checkIfMoveIsLegal() {
		// TODO Auto-generated method stub
		
	}
	
	
}
