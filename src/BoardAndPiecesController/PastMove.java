package BoardAndPiecesController;

import ChessPieces.Bishop;
import ChessPieces.Brook;
import ChessPieces.King;
import ChessPieces.Knight;
import ChessPieces.Pawn;
import ChessPieces.Queen;
import ChessPieces.SuperPiece;
import ChessPieces.Tile;

public class PastMove {

	private Tile tileSource;
	private Tile tileDestination;
	private SuperPiece sourcePiece;
	private SuperPiece destinationPiece;
	private String sourcePieceType;
	private String destPieceType;
	private boolean pawnsLastMovemementWasItsFirst;
	public PastMove(Tile ts, Tile td){
		tileSource = new Tile(ts);
		tileDestination = new Tile(td);
		sourcePiece = ts.getPieceOnTile();
		destinationPiece = td.getPieceOnTile();
		if(sourcePiece != null){
			if(sourcePiece instanceof Queen){
				sourcePieceType = "Queen";
			}else if( sourcePiece instanceof King){
				sourcePieceType = "King";
			}else if( sourcePiece instanceof Brook){
				sourcePieceType = "Brook";
			}else if( sourcePiece instanceof Knight){
				sourcePieceType = "Knight";
			}else if( sourcePiece instanceof Bishop){
				sourcePieceType = "Bishop";
			}else if( sourcePiece instanceof Pawn){
				if(((Pawn) sourcePiece).getHasMadeFirstMove() == true){
					pawnsLastMovemementWasItsFirst = false;
					sourcePieceType = "Pawn";
				}else{
					pawnsLastMovemementWasItsFirst = true;
				}
			}
		}
		if(destinationPiece != null){
			if(destinationPiece instanceof Queen){
				destPieceType = "Queen";
			}else if( destinationPiece instanceof King){
				destPieceType = "King";
			}else if( destinationPiece instanceof Brook){
				destPieceType = "Brook";
			}else if( destinationPiece instanceof Knight){
				destPieceType = "Knight";
			}else if( destinationPiece instanceof Bishop){
				destPieceType = "Bishop";
			}else if( destinationPiece instanceof Pawn){
				destPieceType = "Pawn";
			}
		}


	}

	public int getTileSourceXCoordinate(){
		return (int) tileSource.getBoardLocation().getX();
	}
	public int getTileSourceYCoordinate(){
		return (int) tileSource.getBoardLocation().getY();
	}
	public int getTileDestinationXCoordinate(){
		return (int) tileDestination.getBoardLocation().getX();
	}
	public int getTileDestinationYCoordinate(){
		return (int) tileDestination.getBoardLocation().getY();
	}
	public SuperPiece getSourcePiece(){
		return sourcePiece;
	}
	public SuperPiece getDestinationPiece(){
		return destinationPiece;
	}
	public String getDestPieceType(){
		return destPieceType;
	}
	public String getSourcePieceType(){
		return sourcePieceType;
	}
	public void setPawnsLastMovemementWasItsFirst(boolean b){
		pawnsLastMovemementWasItsFirst = b;
	}
	public boolean getPawnsLastMovemementWasItsFirst(){
		return pawnsLastMovemementWasItsFirst;
	}

}
