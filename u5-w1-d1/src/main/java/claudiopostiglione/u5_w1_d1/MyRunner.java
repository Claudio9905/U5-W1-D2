package claudiopostiglione.u5_w1_d1;

import claudiopostiglione.u5_w1_d1.entities.Menu;
import claudiopostiglione.u5_w1_d1.entities.Ordine;
import claudiopostiglione.u5_w1_d1.entities.StatoOrdine;
import claudiopostiglione.u5_w1_d1.entities.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@PropertySource("application.properties")
@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    private @Qualifier("tavolo1") Tavolo tavolo1;
    @Autowired
    private @Qualifier("tavolo2") Tavolo tavolo2;
    @Autowired
    private @Qualifier("tavolo3") Tavolo tavolo3;

    @Value("${ordine.coperto}")
    private double ordineCoperto;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n");
        System.out.println("|---                                                 ---|");
        System.out.println("|--------------------- |- MENU - | ---------------------|");
        System.out.println("|---                                                 ---|");
        System.out.println("\n");

        menu.stampaMenu();
        List<Object> elemento1 = List.of(
                menu.getPizze().getFirst(),
                menu.getBevande().getFirst(),
                menu.getToppings().get(3)
        );

        List<Object> elemento2 = List.of(
                menu.getPizze().getFirst(),
                menu.getBevande().getFirst(),
                menu.getToppings().get(3)
        );

        List<Object> elemento3 = List.of(
                menu.getPizze().getFirst(),
                menu.getBevande().getFirst(),
                menu.getToppings().get(3)
        );

        Ordine ordine1 = new Ordine(1, StatoOrdine.IN_CORSO, 3, LocalTime.now(), elemento1, tavolo1, ordineCoperto);
        Ordine ordine2 = new Ordine(2, StatoOrdine.PRONTO, 4, LocalTime.now(), elemento2, tavolo2, ordineCoperto);
        Ordine ordine3 = new Ordine(3, StatoOrdine.SERVITO, 2, LocalTime.now(), elemento3, tavolo3, ordineCoperto);

        System.out.println("\n");
        System.out.println("|------------------- Ordini -------------------|");
        System.out.println("| " + ordine1);
        System.out.println("| " + ordine2);
        System.out.println("| " + ordine3);
    }
}
