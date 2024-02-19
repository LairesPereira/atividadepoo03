package questao03;

public class Animal {
    String nome;
    String especie;
    String alimentacao;
    int peso;
    Animal(String nome, String especie, String alimentacao, int peso) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    void comer(int pesoAlimento) {
        if(peso <= 0) { return; }
        this.peso += pesoAlimento;
    }

    void necessidades() {
        peso -= peso * 0.05;
    }
}
