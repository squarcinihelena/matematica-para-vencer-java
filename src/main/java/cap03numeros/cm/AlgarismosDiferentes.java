package cap03numeros.cm;

public class AlgarismosDiferentes {
//    Determine a quantidade de números naturais de 3 algarismos onde a centena e a unidade sejam iguais, mas a dezena seja diferente delas (ex: 101, 252, 303)

    public static void main(String[] args) {
        int cont = 0;

        for (int i = 100; i <= 999; i++){
            int centena = i /100;
            int dezena = (i/10) % 10;
            int unidade = i % 10;

            boolean regraReal = (centena == unidade) && (centena != dezena);

            if (regraReal) {
                System.out.println("numero encontrado: " +i);
                cont++;
            }
        }

        System.out.println("quantidade de numeros encontrados: " + cont);

    }
}
