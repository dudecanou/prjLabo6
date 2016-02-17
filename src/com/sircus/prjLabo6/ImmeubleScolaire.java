package com.sircus.prjLabo6;

public class ImmeubleScolaire extends Lot{
	private int nbrEtage;

	// ----------------------------- NOMBRE D'ETAGE ------------------------------
	public int getNbrEtage() {
		return nbrEtage;
	}

	public void setNbrEtage(int nbrEtage) {
		this.nbrEtage = nbrEtage;
	}
	
	public ImmeubleScolaire (String type, String num, String adr, double surf, double eval, int nbr)
	{
		super(type,num,adr,surf,eval);
		setNbrEtage(nbr);
	}
	
	public String toString()
	   {
		return String.format( 
				 "%s"+
		         "Nombre d'etages :%s "+
				 super.toString(),getNbrEtage());
	   }
}
