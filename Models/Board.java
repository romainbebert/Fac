package asd.proj.model;

import java.awt.Color;
import java.util.Random;
import asd.proj.Constante;
import java.util.ArrayList;

class Board{

	private Case[][] _grid;
	private Case[] _starsp1;
	private Case[] _starsp2;

	public Board(){
		Random rand= new Random();
		int randx= nextInt(length);
		int randy= nextInt(length);
		_grid = new Case[length][length];

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

	public Case[][] getGrid{
		return _grid;
	}

	public void setCase(int x, int y, Color color, ClassUnion union){
		ArrayList<ClassUnion> list = this.relieComposante(x,y,color);
		if (list.size()==0){
			_grid[x][y].setColor(color);
		} else {
			for(ClassUnion class : list ){
				class.union();
			}
		}
	}

	public ArrayList<ClassUnion> relieComposante(int x, int y, Color color){

		ArrayList<ClassUnion> possibility = new ArrayList<ClassUnion>();
		for (int i=x-1; i<x+2; ++i){
			for(int j=y-1;j<y+2; ++i){
				if(_grid[i][j].getColor()==color)
					possibility.add(_grid[i][j].getClass());
			}
		}
	}

}
