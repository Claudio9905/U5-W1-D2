package claudiopostiglione.u5_w1_d1.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Bevanda {
    private String nome;
    private double costo;
    private int calorie;

    @Override
    public String toString() {
        return
                "| "+ nome + "   " + "Costo: [" + costo + " €]   " + "Calorie: [" + calorie +"] ";
    }
}
