package asd.proj.model;

import java.awt.Color;
import asd.proj.Constant;


class Classe{

	private int _id;
	private static int _cnt = 0;
	private Color _color;
	private int _nbStars;

	public Classe(){
		_color= Color.WHITE;
		_star=false;
		_id = ++_cnt;
	}

	public Color getColor(){
		return _color;
	}
	public void setColor(Color color){
		_color = color;
	}
	public ClassUnion getClass(){
		return _union;
	}
	public void setClass(ClassUnion union){
		_union = union;
	}
	public boolean getStar(){
		return _star;
	}
	public void setStar(boolean star){
		_star = star;
	}

	public int classe(){

	}

	public void union(){

	}

}
