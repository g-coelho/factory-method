import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoRessonanciaTest {

    @Test
    void deveRealizarRessonancia() {
        IServico servico = ServicoFactory.obterServico("Ressonancia");
        assertEquals("Ressonância realizada.", servico.examinar());
    }

    @Test
    void deveAvaliarRessonancia() {
        IServico servico = ServicoFactory.obterServico("Ressonancia");
        assertEquals("Avaliação da ressonância.", servico.avaliar());
    }
}
