package model;

public class Restaurant {
    private CentraleReservation<Table, FormulaireRestaurant> centrale;

    public Restaurant(int capacite) {
        centrale = new CentraleReservation<>(new Table[capacite]);
    }

    public int ajouterTable(CalendrierAnnuel calendrier, int nbPlaces) {
        return centrale.ajouterEntite(new Table(calendrier, nbPlaces));
    }

    public int[] donnerPossibilites(FormulaireRestaurant f) {
        return centrale.donnerPossibilites(f);
    }

    public Reservation reserver(int num, FormulaireRestaurant f) {
        return centrale.reserver(num, f);
    }
}
