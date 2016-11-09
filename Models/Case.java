package asd.proj.model;

import java.awt.Color;
import asd.proj.Constant;


class Case{

	private Color _color;
	private ClassUnion _union;
	private boolean _star;

	public Cellule(){
		_color= Color.WHITE;
		_union = new Classe(Constant.id);
		_star=false;
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

}
