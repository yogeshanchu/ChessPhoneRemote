package com.Chess;

import java.util.ArrayList;
import java.util.HashMap;

public class ChessPiece {
	
	public HashMap<Integer,ArrayList<Integer>> chessPieceMap = new HashMap<Integer,ArrayList<Integer>>();
	
	private static final int DIGIT_PLACES=10;
	
	private double moveCount = 0;
	
	public double countLegalMoves(int pos)
	{
		return this.countLegalMoves(pos,DIGIT_PLACES);
	}
	
	private double countLegalMoves(int startPos,int digits)
	{
		
		
		ArrayList arrayList = chessPieceMap.get(new Integer(startPos));
		
		if(digits == 1){
			moveCount = moveCount + 1;
		}else{
		
			
		for(int i=0; i< arrayList.size();i++){
						
			countLegalMoves((int)arrayList.get(i),digits-1);
		}
		
		}
	return 	moveCount;
	}


}
