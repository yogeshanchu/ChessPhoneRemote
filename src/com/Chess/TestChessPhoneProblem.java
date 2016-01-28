package com.Chess;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TestChessPhoneProblem {

	@Test
	public void test() {
			
    ChessPiece chessPiece;
		
	int position = 5;
	String chessPieceType = "Queen";
		
		
		if(chessPieceType.equalsIgnoreCase("King")){
			chessPiece = new King();
		}
		else{
		    chessPiece = new Queen();
		}
		
		
		Double d = chessPiece.countLegalMoves(position);
		
		System.out.println(" No of Moves for a "+ chessPieceType+ " is  "+ d);
	}

}
