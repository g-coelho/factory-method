import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoEletrocardiogramaTest {

    @Test
    void deveRealizarEletrocardiograma(){
        IServico servico = ServicoFactory.obterServico("Eletrocardiograma");
        assertEquals("Eletrocardiograma realizado.", servico.examinar());
    }

    @Test
    void deveAvaliarEletrocardiograma(){
        IServico servico = ServicoFactory.obterServico("Eletrocardiograma");
        assertEquals("Avaliação do eletrocardiograma.", servico.avaliar());

    }

}
