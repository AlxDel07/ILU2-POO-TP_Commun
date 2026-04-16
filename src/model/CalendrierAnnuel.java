package model;


public class CalendrierAnnuel {
	
	private Mois[] calendrier;
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for(int i=0;i<nbJours;i++) {
				jours[i] = true;
			}
		}
		private boolean estLibre(int jour) {
			return jours[jour - 1];
		}
		
		private boolean reserver(int jour) {
			if(estLibre(jour)) {
				jours[jour-1] = false;
				return true;
			}else {
				return false;
			}
			
		}
	}
	
	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		calendrier[0] = new Mois("janvier",31);
		calendrier[1] = new Mois("fevrier",28);
		calendrier[2] = new Mois("mars",31);
		calendrier[3] = new Mois("avril",30);
		calendrier[4] = new Mois("mai",31);
		calendrier[5] = new Mois("juin",30);
		calendrier[6] = new Mois("juillet",31);
		calendrier[7] = new Mois("aout",31);
		calendrier[8] = new Mois("septembre",30);
		calendrier[9] = new Mois("octobre",31);
		calendrier[10] = new Mois("novembre",30);
		calendrier[11] = new Mois("decembre",31);
	}
	
	private int indiceMois(String mois) {
		switch(mois) {
		case "janvier":
			return 0;
		case "fevrier":
			return 1;
		case "mars":
			return 2;
		case "avril":
			return 3;
		case "mai":
			return 4;
		case "juin":
			return 5;
		case "juillet":
			return 6;
		case "aout":
			return 7;
		case "septembre":
			return 8;
		case "octobre":
			return 9;
		case "novembre":
			return 10;
		case "decembre":
			return 11;
		default:
			return -1;
		}
	}
	public boolean estLibre(int jour, int mois) {
		Mois moisLibre = calendrier[mois - 1];
		return moisLibre.estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		Mois moisReservation = calendrier[mois - 1];
		return moisReservation.reserver(jour);
	}
}
