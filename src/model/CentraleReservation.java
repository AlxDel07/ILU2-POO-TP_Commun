package model;

public class CentraleReservation<T extends EntiteReservable<F>, F extends Formulaire> {
    private T[] entites;
    private int nb;

    public CentraleReservation(T[] entites) {
        this.entites = entites;
        this.nb = 0;
    }

    public int ajouterEntite(T e) {
        e.setNumero(nb + 1);
        entites[nb] = e;
        nb++;
        return e.getNumero();
    }

    public int[] donnerPossibilites(F f) {
        int[] res = new int[nb];

        for (int i = 0; i < nb; i++) {
            if (entites[i].compatible(f)) {
                res[i] = entites[i].getNumero();
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    public Reservation reserver(int num, F f) {
        T e = entites[num - 1];
        f.setIdentificationEntite(num);
        return e.reserver(f);
    }
}
