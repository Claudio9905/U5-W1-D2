package claudiopostiglione.u5_w1_d1.entities;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//@AllArgsConstructor
@Component
@Getter
@Setter
public class Menu {
    @Autowired
    private List<Pizza> pizze;
    @Autowired
    private List<Toppings> toppings;
    @Autowired
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
