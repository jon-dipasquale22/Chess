package ChessPieces;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import ChessPieces.EnumsClass.chessPieceColor;
import ChessPieces.EnumsClass.chessPieceType;

/*
 * This calls is the Super class of all chess pieces
 */
public abstract class SuperPiece extends JLabel{
	
	protected chessPieceColor pieceColor;
	protected ImageIcon pieceIcon;
	public SuperPiece(){
		
	}
	/*
	 * checks to see if a potential move is legal
	 */
	public abstract void checkIfMoveIsLegal();
	
	
	public boolean equals (SuperPiece pc){
		if (pc instanceof Queen){
			return true;
		}else{
			return false;
		}
	}
	
	public ImageIcon getPieceIcon(){
		return pieceIcon;
	}
	
	public chessPieceColor getPieceColor(){
		return pieceColor;
	}
	
	
}
