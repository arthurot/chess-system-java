package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	private Color color;
	//private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
		//this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

}
