package cap03numeros.cm;

public class SomaCinco {
//    Determine a quantidade de números naturais de 3 algarismos distintos cuja soma seja igual a 5.

    public static void main(String[] args) {

        int cont = 0;

        for (int i = 100; i <= 999; i++){
         int centena = i / 100;
         int dezena = (i / 10) % 10;
         int unidade = i % 10;

         boolean somaCinco = (centena + dezena + unidade == 5);
         boolean distintos = (centena != dezena) && (centena != unidade) && (dezena != unidade);

         if (somaCinco && distintos){
             System.out.println("numero encontrado: " + i);
             cont++;
         }
        }

        System.out.println("quantidade de numeros encontrados: " + cont);

    }


}
