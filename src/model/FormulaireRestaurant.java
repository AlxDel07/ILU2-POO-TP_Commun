package model;

public class FormulaireRestaurant extends Formulaire{

	private int nbPersonnes;
	private int numeroService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nbPersonnes = nbPersonnes;
		this.numeroService = numService;
	}
	
	public int getNumService() {
		return this.numeroService;
	}
	
	public int getNombrePersonnes() {
		return this.nbPersonnes;
	}
	
	public int getService() {
		return this.numeroService;
	}

}


