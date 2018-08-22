package POO;

public class Quadrado {
    public int Dimensao;

    public Quadrado() {

    }

    public void DesenhaQuadrado(int dimensao) {
        int aux1;
        int aux2;
        for (aux1 = 1; aux1 <= dimensao; aux1++) {
            for (aux2 = 1; aux2 <= dimensao; aux2++) {
                if (aux1 == 1 || aux1 == dimensao || aux2 == dimensao || aux2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
