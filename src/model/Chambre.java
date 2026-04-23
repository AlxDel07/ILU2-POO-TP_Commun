package model;

public class Chambre extends EntiteReservable<FormulaireHotel>{
	
	public Chambre(CalendrierAnnuel calendrier, int numero) {
		this.calendrier = calendrier;
		this.numero = numero;
	}
	
	public boolean compatible(FormulaireHotel f) {

        return estLibre(f);
    }
    
    public Reservation reserver(FormulaireHotel f) {

        if (!compatible(f)) return null;

        calendrier.reserver(f.getJour(), f.getMois());

        return new ReservationSpectacle(
                f.getJour(),
                f.getMois(),
                f.getNumChambre(),
                f.getNbLitsDoubles()
        );
    }

}
