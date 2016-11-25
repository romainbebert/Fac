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
		return possibility;
	}

	public boolean existPathCases(Case case1, Case case2, Color color)
	{
		return (case1.getColor == color) && (case1.getClass() == case2.getClass());
	}

	public int linkFreeCase(int x1, int y1, int x2, int y2, Case cas1, Case case2)
	{
		if(_grid[x1][y1].getColor() == _grid[x2][y2].getColor())
		{
			countRec(x1,y1,x2,y2,_grid[x1][y1].getColor());
		}
	}

	private int countRec(int x1, int y1, int x2, int y2, Color color)
	{
		if(x1==x2 && y1==y2)
		{
			return 0;
		}
		else
		{
			if(x2-x1>0)
			{
				++x2;
			}
			else
			{
				--x2;
			}

			if(y2-y1>0)
				y2++;
		}
	}

}
