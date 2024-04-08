package pckg_vecera_main_part;

import java.util.concurrent.ThreadLocalRandom;

public class Glavno_jelo {

    float cijena;

    public Glavno_jelo(){
        System.out.println("Spremljeno i servirano glavno jelo!!!");
    }

    float totalPrice(){
        return ThreadLocalRandom.current().nextFloat(50.5f, 250.8f);
    }
}
