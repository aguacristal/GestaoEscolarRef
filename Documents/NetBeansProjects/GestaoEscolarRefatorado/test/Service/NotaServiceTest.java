package Service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotaServiceTest {
    
    @Test
    public void testCalcularMedia() {
        // passa null porque não vamos salvar nada no repositório
        NotaService servico = new NotaService(null);
        double resultado = servico.calcularMedia(8.0, 6.0);
        assertEquals(7.0, resultado, 0.01); // esperado 7.0
    }
    
    @Test
    public void testVerificarAprovacao() {
        NotaService servico = new NotaService(null);
        assertTrue(servico.verificarAprovacao(6.5));
        assertFalse(servico.verificarAprovacao(5.0));
    }
}
