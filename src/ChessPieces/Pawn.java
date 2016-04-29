package ChessPieces;

import javax.swing.ImageIcon;

import ChessPieces.EnumsClass.chessPieceColor;

public class Pawn extends SuperPiece {

	private boolean hasMadeFirstMove;
	
	public Pawn(chessPieceColor pc){
		super();
		hasMadeFirstMove = false;
		pieceColor = pc;
		if(pieceColor == chessPieceColor.BLACK){
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("PawnBlack.png"));
			
		}else{
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("PawnWhite.png"));
		}
	}

	@Override
	public void checkIfMoveIsLegal() {
		// TODO Auto-generated method stub
		
	}
	public boolean getHasMadeFirstMove(){
		return hasMadeFirstMove;
	}
	 public void setHasMadeFirstMove( boolean b ){
		 hasMadeFirstMove = b;
	 }
	 
	 
	
	
}
