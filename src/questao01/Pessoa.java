package questao01;

public class Pessoa {
    String nome;
    String profissao;
    String curso;
    int matricula;
    int idade;

    void falar(String frase) {
        System.out.println(frase);
    }

    void pagarBoleto(int numeroBoleto) {
        System.out.printf("Pagando boleto: %d", numeroBoleto);
    }
}
