package model;

public class FormulaireHotel extends Formulaire{
	
	private int nbLitsDoubles;
	private int numChambre;
	
	public FormulaireHotel(int jour, int mois,int nbLits,int numChambre) {
		this.jour = jour;
		this.mois = mois;
		this.nbLitsDoubles = nbLits;
		this.numChambre = numChambre;
	}
	
	public int getNbLitsDoubles() {
		return this.nbLitsDoubles;
	}
	
	public int getNumChambre() {
		return this.numChambre;
	}

}
