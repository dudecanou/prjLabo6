package com.sircus.prjLabo6;

public interface Arrondissement {

	public enum NomArrondissement
	{
		POINTE_AUX_TREMBLES(0.052),
		PLATEAU_MONT_ROYAL(0.043),
		ROSEMONT(0.032), 
		OUTREMONT(0.045), 
		VILLE_MARIE(0.067), 
		MERCIER_HOCHELAGA_MAISONNEUVE(0.034);
		private double valeur;
		
		public double getValeur()
		{
		return valeur;
		} 
		
		private NomArrondissement(double value)
		{
			valeur = value;
		}
		
	};
}

