package questao03;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Animal("Leão", "Felino", "Carnivoro", 100);
        Animal veado = new Animal("Veado", "Blastocerus dichotomus", "Herbivoro", 30);

        System.out.printf("Peso: %d \n", leao.peso);
        leao.comer(veado.peso);
        System.out.printf("Peso pós refeicao: %d\n", leao.peso);
        leao.necessidades();
        System.out.printf("Peso pós necessidades: %d\n", leao.peso);

    }
}
