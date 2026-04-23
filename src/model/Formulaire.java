package model;

public abstract class Formulaire {
	
	protected int jour;
	protected int mois;
	protected int identification;
	
	public int getJour() {
		return this.jour;
	}

	public int getMois() {
		return this.mois;
	}
	
	public int getIdentificationEntite() {
		return this.identification;
	}
	
	public void setIdentificationEntite(int id) {
		this.identification = id;
	}
	
}
