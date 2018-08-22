package POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("- 1.  Digite 1 para imprimir um quadrado  -");
            System.out.println("- 2.  Digite 2 para imprimir um losango   -");
            System.out.println("-------------------------------------------");
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();

            int d;
            switch (opcao) {
                case 1:
                    System.out.println("Entre com o lado do quadrado:");
                    Quadrado q1 = new Quadrado();
                    d = ler.nextInt();
                    q1.DesenhaQuadrado(d);
                    break;

                case 2:
                    System.out.print("Digite um número ímpar entre  1 a 19: ");
                    d = ler.nextInt();
                    int aux = 1;
                    // Faz um tratamento para aceitar somente números ímpares entre 1 a 19
                    while ((d % 2 == 0) || (d < 1) || (d > 19)) {
                        System.out.print("ERRO. Digite um número ímpar entre  1 a 19: ");
                        d = ler.nextInt();
                    } // fim do tratamento - loop while

                    Losango losango = new Losango(d);
                    losango.gerarLosango();

                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
    }
}
