package claudiopostiglione.u5_w1_d1;

import claudiopostiglione.u5_w1_d1.entities.Bevanda;
import claudiopostiglione.u5_w1_d1.entities.Menu;
import claudiopostiglione.u5_w1_d1.entities.Pizza;
import claudiopostiglione.u5_w1_d1.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Menu menu = ctx.getBean(Menu.class);
        System.out.println("\n");
        System.out.println("|---                                                 ---|");
        System.out.println("|--------------------- |- MENU - | ---------------------|");
        System.out.println("|---                                                 ---|");
        System.out.println("\n");
        menu.stampaMenu();

	}

}
