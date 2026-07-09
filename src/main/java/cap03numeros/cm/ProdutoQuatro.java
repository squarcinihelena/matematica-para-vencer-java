package cap03numeros.cm;

public class ProdutoQuatro {
//    Determine a quantidade de números naturais de 3 algarismos distintos cujo produto (multiplicação) dos seus algarismos seja igual a 4

    public static void main(String[] args) {
        int cont = 0;

        for (int i = 100; i <= 999; i++){
            int centena = i / 100;
            int dezena = (i /10) % 10;
            int unidade = i % 10;

            boolean algarismoDiff = (centena != dezena) && (centena != unidade) && (unidade != dezena);
            boolean produtoQuatro = (centena * dezena * unidade == 4);

            if(algarismoDiff && produtoQuatro){
                System.out.println("numero encontrado: " +i);
                cont++;
            }
        }

        System.out.println("contagem de numeros encontrados: " +cont);

    }

}
