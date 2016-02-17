package com.sircus.prjLabo6;

public abstract class Lot {

	private String typeLot;
	private String numLot;
	private String adresse;
	private double surface;
	private double evaluation;
	
	//----------------------------------- TYPE ------------------------------------
	
	public String getTypeLot() {
		return typeLot;
	}
	public void setType(String typeLot) {
		this.typeLot = typeLot;
	}
	
	//------------------------------- NUMERO DU LOT --------------------------------
	
	public String getNumLot() {
		return numLot;
	}
	public void setNumLot(String numLot) {
		this.numLot = numLot;
	}
	
	//---------------------------------- ADRESSE -----------------------------------

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	//---------------------------------- SURFACE -----------------------------------

	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	//--------------------------------- EVALUATION ---------------------------------

	public double getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}
	
	
	public Lot (String type, String num, String adr, double surf, double eval)
	{
		typeLot = type;
		numLot = num;
		adresse = adr;
		surface = surf;
		evaluation = eval;
	}
	
	public String toString()
	   {
		return String.format( 
		         "Type du batiment :%s "+  
		         "\nNumero :%s "+ 
		         "\nAdresse :%s "+
				 "\nPd Carre :%.2f "+ 
				 "\nEvaluation :$%.2f ",
				 getTypeLot(),getNumLot(),getAdresse(),getSurface(),getEvaluation());
	   }
}
