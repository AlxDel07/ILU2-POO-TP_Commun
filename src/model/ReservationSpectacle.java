package model;

public class ReservationSpectacle extends Reservation {
    private int numPlace;
    private int zone;

    public ReservationSpectacle(int jour, int mois, int numPlace, int zone) {
        super(jour, mois);
        this.numPlace = numPlace;
        this.zone = zone;
    }
    
    public int getNumPlace() {
    	return this.numPlace;
    }
    
    public int getZone() {
    	return this.zone;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + " : place n°" + numPlace +
               " dans la zone " + zone;
    }
}
