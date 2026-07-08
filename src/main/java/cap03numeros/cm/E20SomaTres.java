package cap03numeros.cm;

public class E20SomaTres {
//    Determine a quantidade de numeros naturais de 3 algarismos distintos, cuja soma seja igual a 3.
//    (pag37 colegio militar)

    public static void main(String[] args) {
        int cont = 0;

        for (int i = 100; i <= 999; i++) {
            int centena = i / 100;
            int dezena = (i / 10) % 10;
            int unidade = i % 10;

            boolean somaTres = (centena + dezena + unidade == 3);
            boolean distintos = (centena != dezena) && (centena != unidade) && (dezena != unidade);

            if (somaTres && distintos) {
                System.out.println("Numero encontrado: " + i);
                cont++;
            }
        }

        System.out.println("Total de numeros encontrados: " + cont);
    }
}


