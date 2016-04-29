package ChessPieces;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import ChessPieces.EnumsClass.chessPieceColor;
import ChessPieces.EnumsClass.chessPieceType;

public class Queen extends SuperPiece{

	public Queen( chessPieceColor pc) {
		super();
		pieceColor = pc;
		if(pieceColor == chessPieceColor.BLACK){
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("QueenBlack.png"));
			
		}else{
			pieceIcon = new ImageIcon(this.getClass().getClassLoader().getResource("QueenWhite.png"));
		}
	}

	
	
	@Override
	public void checkIfMoveIsLegal() {
		// TODO Auto-generated method stub
		
	}

}
