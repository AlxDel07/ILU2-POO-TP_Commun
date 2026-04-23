package model;


public class Table extends EntiteReservable<FormulaireRestaurant> {
    private int nbPlaces;
    private CalendrierAnnuel calendrier;

    public Table(CalendrierAnnuel calendrier,int nbPlaces) {
        this.nbPlaces = nbPlaces;
        this.calendrier = calendrier;
    }


    public boolean compatible(FormulaireRestaurant f) {
        boolean bonneCapacite = (nbPlaces == f.getNombrePersonnes() || nbPlaces == f.getNombrePersonnes() + 1);

        boolean libre = estLibre(f);

        return bonneCapacite && libre;
    }
    
    public Reservation reserver(FormulaireRestaurant f) {

        if (!compatible(f)) return null;

        calendrier.reserver(f.getJour(), f.getMois());

        return new ReservationRestaurant(
                f.getJour(),
                f.getMois(),
                numero,
                f.getService()
        );
    }
}