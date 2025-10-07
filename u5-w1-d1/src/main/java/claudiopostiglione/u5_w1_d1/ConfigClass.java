package claudiopostiglione.u5_w1_d1;

import claudiopostiglione.u5_w1_d1.entities.Bevanda;
import claudiopostiglione.u5_w1_d1.entities.Menu;
import claudiopostiglione.u5_w1_d1.entities.Pizza;
import claudiopostiglione.u5_w1_d1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class ConfigClass {

    //Beans per i tipi Pizza
    @Bean
    public Pizza getMargherita() {
        return new Pizza("Margherita", List.of("tomato", "cheese"), 4.99, 1104, true);
    }

    @Bean
    public Pizza getHawaiianPizza() {
        return new Pizza("Hawaiian Pizza", List.of("tomato", "cheese", "ham", "pineapple"), 6.49, 1024,false);
    }

    @Bean
    public Pizza getSalamiPizza() {
        return new Pizza("Salami", List.of("tomato", "cheese", "salami"), 5.99, 1160,true);
    }

    //Beans per i tipi Toppings
    @Bean
    Toppings getCheese() {
        return new Toppings("Cheese", 0.69, 92);
    }

    @Bean
    Toppings getHam() {
        return new Toppings("Ham", 0.99, 35);
    }

    @Bean
    Toppings getOnions() {
        return new Toppings("Onions", 0.69, 22);
    }

    @Bean
    Toppings getPineapple() {
        return new Toppings("Pineapple", 0.79, 24);
    }

    @Bean
    Toppings getSalami() {
        return new Toppings("Salami", 0.99, 86);
    }

    //Beans per i tipi Bevanda
    @Bean
    public Bevanda getLemonade() {
        return new Bevanda("Lemonade (0.33l)", 1.29, 128);
    }

    @Bean
    public Bevanda getWater() {
        return new Bevanda("Water (0.5l)", 1.29, 0);
    }

    @Bean
    public Bevanda getWine() {
        return new Bevanda("Wine (0.75l, 13%)", 7.49, 128);
    }

    //Beans per i tipi Menù
    @Bean
    public Menu getMenu(List<Pizza> pizze, List<Toppings> toppings, List<Bevanda> bevande) {
        return new Menu(pizze, toppings, bevande);
    }
}
