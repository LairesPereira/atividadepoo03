package questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] carros = new Veiculo[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite a marca do carro: ");
            String marca = scanner.nextLine();
            System.out.println("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();
            carros[i] = new Veiculo(marca, modelo);
        }


        System.out.println(carros[0].marca);
        System.out.println(carros[0].modelo);
        System.out.println(carros[0].luzesLigaDesliga);
        carros[0].nivelAr(3);
        carros[0].ligarLuzes();
        System.out.println(carros[0].luzesLigaDesliga);

    }
}
