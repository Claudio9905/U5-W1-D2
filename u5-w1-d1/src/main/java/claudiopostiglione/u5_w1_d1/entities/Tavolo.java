package claudiopostiglione.u5_w1_d1.entities;

import lombok.*;

import java.util.PrimitiveIterator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int id;
    private int numMaxCoperti;
    private StatoTavolo stato;

    @Override
    public String toString() {
        return
                "|- Numero del tavolo: " + id +
                        " Numero Max Coperti: " + numMaxCoperti +
                        " Stato: " + stato +
                        " -|";

    }
}
