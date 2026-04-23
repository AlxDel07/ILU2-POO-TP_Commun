package model;

public class ReservationRestaurant extends Reservation {
    private int numTable;
    private int service;

    public ReservationRestaurant(int jour, int mois, int service, int numTable) {
        super(jour, mois);
        this.numTable = numTable;
        this.service = service;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + "\nTable " + numTable +
               " pour le " + (service == 1 ? "premier" : "deuxième") + " service.";
    }
}
