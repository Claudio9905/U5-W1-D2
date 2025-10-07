package claudiopostiglione.u5_w1_d1.entities;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
public class Ordine {
    private int numOrdine;
    private StatoOrdine stato;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private double totImporto;
    private List<Object> sceltaDalMenu;
    private Tavolo ordineTavolo;



    public Ordine(int numOrdine, StatoOrdine stato, int numCoperti, LocalTime oraAcquisizione, List<Object> sceltaDalMenu, Tavolo tavolo, double ordineCoperto) {
        this.numOrdine = numOrdine;
        this.stato = stato;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.sceltaDalMenu = sceltaDalMenu;
        this.ordineTavolo = tavolo;
        this.totImporto = totOrdine(ordineCoperto);
    }

    private double totOrdine(double ordineCoperto) {
        double sum = ordineCoperto * ordineTavolo.getNumMaxCoperti();
        for (Object elemento : sceltaDalMenu) {
            if (elemento instanceof Pizza) sum += ((Pizza) elemento).getCosto();
            else if (elemento instanceof Bevanda) sum += ((Bevanda) elemento).getCosto();
            else if (elemento instanceof Toppings) sum += ((Toppings) elemento).getCosto();
        }

        return sum;
    }

    @Override
    public String toString() {
        return
                "Numero ordine: " + numOrdine + "\n" +
                "Stato: " + stato + "\n" +
                "Numero coperti: " + numCoperti + "\n" +
                "Ora acquisizione: " + oraAcquisizione + "\n" +
                "Totate importo: " + totImporto + " €" + "\n" +
                "Scelta dal menu: " + sceltaDalMenu + "\n" +
                "Tavolo: " + ordineTavolo + "\n" +
                "-------------------------------------";
    }
}
