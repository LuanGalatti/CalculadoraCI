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
    
        @Test
    void testGetDivisao() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 2.0;
        //Chama a operacao getDivisao()
        double retornoFeito = calculadora.getQuociente();
        //Premissa verifica se os valores são iguais	
        assertEquals(retornoEsperado, retornoFeito);
    }

    @AfterAll
    public void finalizacao() {
        instance = null;
    }
}
