import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoHemogramaTest {
    @Test
    void deveRealizarHemograma(){
        IServico servico = ServicoFactory.obterServico("Hemograma");
        assertEquals("Hemograma realizado.", servico.examinar());
    }

    @Test
    void deveAvaliarHemograma(){
        IServico servico = ServicoFactory.obterServico("Hemograma");
        assertEquals("Avaliação do hemograma.", servico.avaliar());

    }
}
