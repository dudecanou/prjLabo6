package com.sircus.prjLabo6;

public class Immeuble extends Lot{

	private String proprio;

	// ------------------------- NOM PROPRIETAIRE --------------------------

	public String getProprio() {
		return proprio;
	}

	public void setProprio(String proprio) {
		this.proprio = proprio;
	}
	
	public Immeuble(String type, String num, String adr, double surf, double eval, String nom)
	{
		super(type,num,adr,surf,eval);
		setProprio(nom);
	}
	
	public String toString()
	   {
		return String.format( 
				 "%s"+
		         "Nom :%s "+
				 super.toString(),getProprio());
	   }
}
