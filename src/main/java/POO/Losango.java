package POO;

public class Losango {

    private int tamanho;

    public Losango(int tamanho) {
        this.tamanho = tamanho;
    }

    public void gerarLosango(){
        int aux =1;
        for(int i=1;i <= (this.tamanho/2)+1; i++) {    //contador de linhas
            for( int j = (this.tamanho/2)+1; j > i; j-- ) //contador de espaços
                System.out.print( " " );
            for( int k = 1 ; k <= aux; k++ ) //contador de asteriscos
                System.out.print( "*" );
            aux += 2;
            System.out.println();
        }
        aux =aux-2;
        for( int i = 1; i <= (this.tamanho/2); i++ ) //contador de linhas
        {
            for( int j = 1; j <= i; j++ ) //contador de espaços
                System.out.print( " " );
            aux -= 2;
            for( int k = 1 ; k <= aux; k++ ) //contador de asteriscos
                System.out.print( "*" );
            System.out.println();
        }
    }
}
