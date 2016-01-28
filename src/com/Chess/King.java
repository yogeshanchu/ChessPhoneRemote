package com.Chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

class King extends ChessPiece{

	public King(){
	
		chessPieceMap.put(new Integer (1),new ArrayList<Integer>(Arrays.asList(1,2,4,5)));
		
		chessPieceMap.put(new Integer (2),new ArrayList<Integer>(Arrays.asList(2,3,6,5,4,1)));
		
		chessPieceMap.put(new Integer (3),new ArrayList<Integer>(Arrays.asList(3,6,5,2)));
		
		chessPieceMap.put(new Integer (4),new ArrayList<Integer>(Arrays.asList(4,1,2,5,8,7)));
		
		chessPieceMap.put(new Integer (5),new ArrayList<Integer>(Arrays.asList(5,1,2,3,4,6,7,8,9)));
		
		chessPieceMap.put(new Integer (6),new ArrayList<Integer>(Arrays.asList(6,3,2,5,8,9)));
		
		chessPieceMap.put(new Integer (7),new ArrayList<Integer>(Arrays.asList(7,4,5,8,0)));
		
		chessPieceMap.put(new Integer (8),new ArrayList<Integer>(Arrays.asList(8,7,4,5,6,9,0)));
		
		chessPieceMap.put(new Integer (9),new ArrayList<Integer>(Arrays.asList(9,0,8,5,6)));
		
		chessPieceMap.put(new Integer (0),new ArrayList<Integer>(Arrays.asList(0,7,8,9)));
		
	}

}
