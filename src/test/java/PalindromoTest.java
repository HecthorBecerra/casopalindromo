import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void conPalindromo() {
        assertTrue(Palindromo.verificadorPalindromo("oso"));
    }

    @Test
    void palindromoConEspacios() {
        assertTrue(Palindromo.verificadorPalindromo("anita lava la tina"));
    }

    @Test
    void noPalindromo() {
        assertFalse(Palindromo.verificadorPalindromo("caso de palindromos"));
    }

    @Test
    void seriesNumeros() {
        assertFalse(Palindromo.verificadorPalindromo("231"));
    }

    @Test
    void numeroSimetrico() {
        assertTrue(Palindromo.verificadorPalindromo("121"));
    }

    @Test
    void palindromoMayusculas() {
        assertTrue(Palindromo.verificadorPalindromo("Oso"));
    }
}