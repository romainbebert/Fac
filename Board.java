package asd.proj.model;

import java.awt.Color;
import java.util.Random;
import asd.proj.Constante;

class Board{

	private Case[][] _grid;

	public Board(){
		Random rand= new Random();
		int randx= nextInt(length);
		int randy= nextInt(length);

		for(Case tile : _grid)
			tile = new Case();

		for(int i=0; i<nbStar; ++i){
			//Player 1 Star
			_grid[randx][randy].setStar(true);
			_grid[randx][randy].setColor(Color.BLUE);
			while(_grid[randx][randy].getStar()){
				randx= nextInt(length);
		 		randy= nextInt(length);
			}
			//Player 2 Star
			grid[randx][randy].setStar(true);
			_grid[randx][randy].setColor(Color.RED);
			while(_grid[randx][randy].getStar()){
				randx= nextInt(length);
		 		randy= nextInt(length);
			}
		}
		
	}

}