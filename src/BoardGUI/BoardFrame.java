package BoardGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import BoardAndPiecesController.GUIHandler;
import ChessPieces.EnumsClass.chessPieceColor;
import ChessPieces.Queen;
import ChessPieces.Tile;
/*
 * This class creates the GUI for the chess Board
 */
public class BoardFrame extends JFrame {

	private JPanel chessBoardGUI;
	 private JPanel gui;
	 private JToolBar tools;
	 private Tile[][] boardSquares;
	 private GUIHandler boardControlr;  //instance of the controller
	 private int xAxis;		// used as x for point
	 private int yAxis;		// used as y for point
	 private JButton undoButton;
	 private JButton resetButton;
	 private JButton quitButton;
	 private JTextArea infoStatusBar;
	 
	public BoardFrame(GUIHandler bc){
		boardControlr = bc;
	
	}
	
	/*
	 * creates the frame and the chess board squares
	 */
	public void createBoard(){
		this.setName("Jon's Chess Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		instatiateJComponents();
		createBoarder();
		//addPiecesToTilesInStartingPosition();
		this.setVisible(true);
		
	}
	/*
	 * This method instatiates all JComponents
	 */
	private void instatiateJComponents(){
		chessBoardGUI = new JPanel();
		gui = new JPanel(new BorderLayout(3, 3));
		tools = new JToolBar();
		undoButton = new JButton("Undo");
		resetButton = new JButton("Reset Game");
		quitButton = new JButton("Quit");

		infoStatusBar = new JTextArea("White's Turn First!");
		chessBoardGUI = new JPanel(new GridLayout(0, 8));
		boardSquares = new Tile[8][8];
		
	}
	/*
	 * This creates the boarder with the buttons
	 * also 
	 */
	private void createBoarder(){
		 gui.setBorder(new EmptyBorder(5, 5, 5, 5));
	        
	        tools.setFloatable(false);
	        gui.add(tools, BorderLayout.PAGE_START);
	        tools.add(resetButton); // TODO - add functionality!

	        tools.addSeparator();
	        tools.add(undoButton); // TODO - add functionality!
	        
	        tools.addSeparator();
	        tools.add(quitButton); // TODO - add functionality!
	        addButtonListeners();
	        tools.addSeparator();
	        tools.add(infoStatusBar);
	        

//	        tools.add("Blacks Move");   // TODO - create message for whose turn it is 
	        chessBoardGUI.setBorder(new LineBorder(Color.BLACK));
	       
	        createChessBoardSquares();
	        gui.add(chessBoardGUI);
	        this.add(gui);
	}
	
	private void addButtonListeners(){
		quitButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});;
		
		
		undoButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				sendUndoEventToContoller(e.getComponent());				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		quitButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				sendResetEventToContoller(e.getComponent());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	
	
	private void createChessBoardSquares(){
		for (int ii = 0; ii < boardSquares.length; ii++) {
            for (int jj = 0; jj < boardSquares[ii].length; jj++) {
            	boardSquares[ii][jj] = new Tile(new Point(ii,jj));
            	if ( (((ii % 2) == 1) &&  ((jj % 2) == 0)) ||
            			(((ii % 2) == 0) &&  ((jj % 2) == 1))){
            		boardSquares[ii][jj].setBackground(Color.LIGHT_GRAY);
            		
            		
            	}else{
            		boardSquares[ii][jj].setBackground(Color.WHITE);

            	}

            	boardSquares[ii][jj].addMouseListener(new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						
						sendActionEventToController(e.getComponent());	
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
            		
            	});
            	boardSquares[ii][jj].setOpaque(true);
            	chessBoardGUI.add(boardSquares[ii][jj]);
            }
		}
		
		

	}
	
	

	 public Tile[][] getChessBoard(){
		 return boardSquares;
	 }
	 public void setChessBoardSquare(Tile[][] cbs){
		 boardSquares = cbs;
	 }
	
	 
	 public void sendActionEventToController(Component c) {

		 boardControlr.boardSquareAction((Tile) c);
		 
	 }
	 
	 public void sendUndoEventToContoller(Component c){
		 
		 boardControlr.undoAction();
	 }
	 
	 public void sendResetEventToContoller(Component c){
		 
		 boardControlr.resetGameBoard();
		 
	 }
	 
	 public void setInfoStatusBar(String s){
		 infoStatusBar.setText(s);

	 }
	 public String getInfoStatusBar(){
		 return infoStatusBar.getText();
	 }

}
