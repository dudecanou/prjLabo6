package com.sircus.prjLabo6;

public class MultiPlex extends Lot {
	private int nbrLogement;

	// ------------------------- NOMBRE DE LOGEMENT --------------------------
	
	public int getNbrLogement() {
		return nbrLogement;
	}

	public void setNbrLogement(int nbrLogement) {
		this.nbrLogement = nbrLogement;
	}

	public MultiPlex (String type, String num, String adr, double surf, double eval, int nbr)
	{
		super(type,num,adr,surf,eval);
		setNbrLogement(nbr);
	}
	
	public String toString()
	   {
		return String.format( 
				 "%s"+
		         "Nombre de logements :%s "+
				 super.toString(),getNbrLogement());
	   }
}
