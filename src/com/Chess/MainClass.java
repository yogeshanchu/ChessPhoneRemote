package com.Chess;

import java.util.Scanner;

public class MainClass {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ChessPiece chessPiece;
			
		
		System.out.println("Enter chessPieceType: ");
		Scanner scanner = new Scanner(System.in);
		String chessPieceType = scanner.nextLine();
		int position = scanner.nextInt();
		
		
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
