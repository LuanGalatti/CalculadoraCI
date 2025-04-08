package modelo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculadoraTest {

    Calculadora instance;

    @BeforeAll
    void inicializacao() {
        instance = new Calculadora(4.0, 2.0);
    }

    /**
     * Teste do método getSoma com um construtor vazio.
     */
    @Test
    void testGetSomaConstrutorVazio() {
        Calculadora calculadora = new Calculadora();
        double expResult = 0.0;
        double result = calculadora.getSoma();
        assertEquals(expResult, result, 0);
    }

    /**
     * Teste do método getSoma.
     */
    @Test
    void testGetSoma() {
        double expResult = 6.0;
        double result = instance.getSoma();
        assertEquals(expResult, result, 0);
    }

    /**
     * Teste do método getDiferenca.
     */
    @Test
    void testGetDiferenca() {
        double expResult = 2.0;
        double result = instance.getDiferenca();
        assertEquals(expResult, result, 0);

    }

    /**
     * Teste do método getProduto.
     */
    @Test
    void testGetProduto() {
        double expResult = 8.0;
        double result = instance.getProduto();
        assertEquals(expResult, result, 0);

    }

    /**
     * Teste do método getQuociente.
     */
    @Test
    void testGetQuociente() {
        double expResult = 2.0;
        double result = instance.getQuociente();
        assertEquals(expResult, result, 0);

    }

    /**
     * Teste do método getExponencial.
     */
    @Test
    void testGetExponencial() {
        double expResult = 16.0;
        double result = instance.getExponencial();
        assertEquals(expResult, result, 0);

    }

    @AfterAll
    public void finalizacao() {
        instance = null;
    }
}
