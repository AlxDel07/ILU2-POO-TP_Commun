package model;

public class ReservationHotel extends Reservation {
    private int numChambre;
    private int nbLits;

    public ReservationHotel(int jour, int mois, int numChambre, int nbLits) {
        super(jour, mois);
        this.numChambre = numChambre;
        this.nbLits = nbLits;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + " : chambre n°" + numChambre +
               " avec " + nbLits + " lits doubles.";
    }
    
    public int getChambre() {
    	return this.numChambre;
    }
    
    public int getLits() {
    	return this.nbLits;
    }
}
