package asd.proj.model;

import java.awt.Color;
import asd.proj.Constant;


class Case
{

	private int _id;
	private static int _cnt = 0;
	private Color _color;
	private boolean _star;
	private Case _casePere;

	public Case()
	{
		_color = Color.WHITE;
		_star = false;
		_casePere = nullptr;
		_id = ++_cnt;
	}

	public Color getColor()
	{
		return _color;
	}
	
	public void setColor(Color color)
	{
		_color = color;
	}
	
	public Case getCase(){
		return _casePere;
	}
	
	public void setCase(Case casePere)
	{
		_casePere = casePere;
	}
	
	public boolean getStar()
	{
		return _star;
	}
	
	public void setStar(boolean star)
	{
		_star = star;
	}

	public Case classe()
	{
		if(this.casePere == nullptr)
		{
			return caseT;
		}
		else
		{
			while (this.casePere.casePere != nullptr)
			{
				this.casePere = this.casePere.casePere;
			}
			return this.casePere;
		}
		
	}

	public void union(Case case1)
	{
		case1.casePere = this;
	}

}
