package org.example;

public class ServicoRadiografia implements IServico{
    public String examinar() {
        return "Radiografia realizada.";
    }

    public String avaliar() {
        return "Avaliação da radiografia.";
    }
}
