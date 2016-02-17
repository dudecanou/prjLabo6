package com.sircus.prjLabo6;

public class Commerce extends Lot {
	
	private String nomCommerce;

	// -------------------------------- NOM PROPRIETAIRE ---------------------------------
	
	public String getNomCommerce() {
		return nomCommerce;
	}

	public void setNomCommerce(String nomCommerce) {
		this.nomCommerce = nomCommerce;
	}


	public Commerce(String type, String num, String adr, double surf, double eval, String nom)
	{
		super(type,num,adr,surf,eval);
		setNomCommerce(nom);
	}
	
	public String toString()
	   {
		return String.format( 
				 "%s"+
		         "Nom :%s "+
				 super.toString(),getNomCommerce());
	   }
}
