package model;

public class FormulaireSpectacle extends Formulaire{
	
	private int numeroZone;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		this.jour = jour;
		this.mois = mois;
		this.numeroZone = numZone;
	}
	
	public int getNumeroZone() {
		return this.numeroZone;
	}
}
