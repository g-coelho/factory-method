import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoRadiografiaTest {

    @Test
    void deveRealizarRadiografia(){
        IServico servico = ServicoFactory.obterServico("Radiografia");
        assertEquals("Radiografia realizada.", servico.examinar());
    }

    @Test
    void deveAvaliarRadiografia(){
        IServico servico = ServicoFactory.obterServico("Radiografia");
        assertEquals("Avaliação da radiografia.", servico.avaliar());

    }
}
