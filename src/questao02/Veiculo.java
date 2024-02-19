package questao02;

public class Veiculo {
    String marca;
    String modelo;
    int nivelArCondicionado = 0;
    final int MAX_NIVEL_AR = 5;
    boolean luzesLigaDesliga = false;

    Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    void ligarLuzes() {
        luzesLigaDesliga = !luzesLigaDesliga;
    }

    void nivelAr(int nivel) {
        if (nivel >= 0 && nivel <= 5){
            nivelArCondicionado = nivel;
            System.out.printf("Nivel do ar: %d \n", nivelArCondicionado);
        } else {
            System.out.println("Nivel deve ser entre 0 e 5!");
        }
    }
}
