package pckg_vecera_main_part;

import pckg_outsource_vecera.Desert;
import pckg_outsource_vecera.Predjelo;

public class Vecera {

    public static void main(String[] args) {

        Predjelo predjelo = new Predjelo("Cezar", "salata", 3);
        Glavno_jelo glavno  = new Glavno_jelo();
        Desert desert = new Desert("Sladoled dupli", 2);
        PredjeloNovo predjelNovo = new PredjeloNovo("Grčka", "Salata", 1);


    }
}
