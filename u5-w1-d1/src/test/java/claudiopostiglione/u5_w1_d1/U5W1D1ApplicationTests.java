package claudiopostiglione.u5_w1_d1;

import claudiopostiglione.u5_w1_d1.entities.Menu;
import claudiopostiglione.u5_w1_d1.entities.Ordine;
import claudiopostiglione.u5_w1_d1.entities.StatoOrdine;
import claudiopostiglione.u5_w1_d1.entities.Tavolo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class U5W1D1ApplicationTests {
    @Autowired
    private @Qualifier("tavolo1") Tavolo tavolo1;
    @Autowired
    private @Qualifier("tavolo2") Tavolo tavolo2;
    @Autowired
    private @Qualifier("tavolo3") Tavolo tavolo3;
    @Autowired
    private Menu menu;

    @BeforeAll
    static void initialSetup() {
        System.out.println("Before All");
    }

    @AfterAll
    static void cleanUp() {
        System.out.println("After All");
    }


    @Test
    void tavoloNotNull() {
        System.out.println("Test [oggetto notNull]");
        assertAll(
                () -> assertNotNull(tavolo1),
                () -> assertNotNull(tavolo2),
                () -> assertNotNull(tavolo3)
        );
    }

    @Test
    void limitCoverTableFor4() {
        System.out.println("Test [Limite posti tavolo]");
        int result = tavolo1.getNumMaxCoperti();
        assertEquals(4, result);
    }

    @Test
    void ordineNotNull() {
        System.out.println("Test [Totale del conto non uguale a 0]");
        Ordine ordineTest = new Ordine();
        assertNotNull(ordineTest);
    }

    @ParameterizedTest
    @ValueSource(doubles = {2, 2.5})
    void totOrdineNotZero(double coperto) {
        System.out.println("Test [Importo totale dell'ordine non uguale a 0]");
        List<Object> ordineElementi = List.of(
                menu.getPizze().getFirst(),
                menu.getToppings().get(3),
                menu.getBevande().getFirst()
        );

        Ordine ordineTest = new Ordine(1, StatoOrdine.IN_CORSO, 3, LocalTime.now().truncatedTo(ChronoUnit.SECONDS), ordineElementi, tavolo1, coperto);
        double totaleImporto = ordineTest.getTotImporto();
        assertNotEquals(0, totaleImporto);
    }

}
