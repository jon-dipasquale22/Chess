package ChessPieces;

import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.border.Border;

public class Tile extends JLabel {

	

	private SuperPiece pieceOnTile;
	private Point boardLocation; 
	private boolean hasBorder;
	public Tile(Point p){
		hasBorder = false;
		pieceOnTile = null;
		boardLocation = p;
	}
	
	
	/*
	 * this construct takes a copy a tile
	 */
	
	public Tile(Tile t){
		if(t.getPieceOnTile() != null){
			pieceOnTile = t.getPieceOnTile();
		}
		boardLocation = t.getBoardLocation();
		hasBorder = t.getHasBorder();
	}
	
	public void setPieceToTile(SuperPiece pc){
		pieceOnTile = pc;
		if(pc instanceof Queen){
			this.setIcon(pieceOnTile.getPieceIcon());
		}else if( pc instanceof King){
			this.setIcon(pieceOnTile.getPieceIcon());
		}else if( pc instanceof Brook){
			this.setIcon(pieceOnTile.getPieceIcon());
		}else if( pc instanceof Knight){
			this.setIcon(pieceOnTile.getPieceIcon());
		}else if( pc instanceof Bishop){
			this.setIcon(pieceOnTile.getPieceIcon());
		}else if( pc instanceof Pawn){
			this.setIcon(pieceOnTile.getPieceIcon());
		}
	}
	
	public void setPieceToNull(){
		pieceOnTile = null;
		this.setIcon(null);
	}
	public boolean hasPiece(){
	
		if(pieceOnTile != null){
			return true;
		}else{
			return false;
		}
	}
	
	public Point getBoardLocation(){
		return boardLocation;
	}
	
	public SuperPiece getPieceOnTile(){
		return pieceOnTile;
	}
	/*
	 * This method tells you id a tile currently has a border
	 */
	public boolean getHasBorder(){
		return hasBorder;
	}
	public void setHasBorder(boolean b){
		hasBorder = b;
	}
	/*
	 * This sets the tiles border and sets the hasBorder value to true
	 */
	public void setTileBorder(Border b){
		this.setBorder(b);
		hasBorder = true;
	}
	
	/*
	 * This sets the tiles border to Null and sets hasBorder to false
	 * 
	 */
	public void setTileBorderToNull(){
		this.setBorder(null);
		hasBorder = false;
	}
	
}
