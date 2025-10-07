package claudiopostiglione.u5_w1_d1.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizze;
    private List<Toppings> toppings;
    private List<Bevanda> bevande;

    public void stampaMenu(){
        System.out.println("|-- Pizze --|");
        pizze.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("|-- Toppings --|");
        toppings.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("|-- Bevande --|");
        bevande.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");

    }
}
