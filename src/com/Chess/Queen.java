package com.Chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Queen extends ChessPiece {
	
	
	
	public Queen(){
		
		chessPieceMap.put(new Integer (1),new ArrayList<Integer>(Arrays.asList(1,2,3,5,9,4,7)));//7
		
		chessPieceMap.put(new Integer (2),new ArrayList<Integer>(Arrays.asList(2,1,4,5,8,3,6,0)));//8
		
		chessPieceMap.put(new Integer (3),new ArrayList<Integer>(Arrays.asList(3,6,9,2,1,5,7)));//7
		
		chessPieceMap.put(new Integer (4),new ArrayList<Integer>(Arrays.asList(4,1,7,5,6,2,8)));//7
		
		chessPieceMap.put(new Integer (5),new ArrayList<Integer>(Arrays.asList(5,1,2,3,4,6,7,8,9,0)));//10
		
		chessPieceMap.put(new Integer (6),new ArrayList<Integer>(Arrays.asList(6,9,3,2,5,8,4)));//7
		
		chessPieceMap.put(new Integer (7),new ArrayList<Integer>(Arrays.asList(7,8,9,0,5,4,1,3)));//8
		
		chessPieceMap.put(new Integer (8),new ArrayList<Integer>(Arrays.asList(8,7,9,0,4,5,6,2)));//8
		
		chessPieceMap.put(new Integer (9),new ArrayList<Integer>(Arrays.asList(9,0,8,7,5,6,1,3)));//8
		
		chessPieceMap.put(new Integer (0),new ArrayList<Integer>(Arrays.asList(0,7,8,9,5,2)));//6
		
		
	}
	
}
