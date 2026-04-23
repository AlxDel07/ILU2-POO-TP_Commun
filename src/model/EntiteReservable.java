package model;


public abstract class EntiteReservable<F extends Formulaire> {
	protected CalendrierAnnuel calendrier;
	protected int numero;
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public boolean estLibre(Formulaire f) {
		int jour = f.getJour();
		int mois = f.getMois();
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(F f);
	
	public abstract Reservation reserver(F f);
}


