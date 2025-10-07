package claudiopostiglione.u5_w1_d1.entities;


import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pizza {
    private String nome;
    private List<String> toppings;
    private double costo;
    private int calorie;
    private boolean isXl;


    @Override
    public String toString() {

        if (isXl) {
            return
                    "| " + nome + " (" + toppings + ")   " + " /XL: [Si] " + "  Costo: [" + costo + " €]   " + " Calorie: [" + calorie + "] "
                    ;
        } else {
            return
                    "| " + nome + " (" + toppings + ")   " + " /XL: [No] " + "  Costo: [" + costo + " €]   " + " Calorie: [" + calorie + "] "
                    ;
        }
    }
}
