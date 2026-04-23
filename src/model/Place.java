package model;

public class Place extends EntiteReservable<FormulaireSpectacle>{
	
	public Place(CalendrierAnnuel calendrier, int numero) {
		this.calendrier = calendrier;
		this.numero = numero;
	}
	
	public boolean compatible(FormulaireSpectacle f) {

        return estLibre(f);
    }
    
    public Reservation reserver(FormulaireSpectacle f) {

        if (!compatible(f)) return null;

        calendrier.reserver(f.getJour(), f.getMois());

        return new ReservationSpectacle(
                f.getJour(),
                f.getMois(),
                numero,
                f.getNumeroZone()
        );
    }

}
