
/**
 *
 * @author Henrique Padovani
 */
import java.util.Random;

public class BubbleSort {

    static int mov = 0;
    static int comp = 0;
    static int[] intVet = new int[250];
    private static long tempoInicial;

    public static void main(String[] args) {
        Random objRandom = new Random();
        for (int i = 0; i < intVet.length; i++) {
            intVet[i] = objRandom.nextInt(1200);
        }
        try {

            boolean blnFlag = true;

            while (blnFlag) {
                blnFlag = false;
                long tempoInicial = System.currentTimeMillis();
                for (int i = 0; i < intVet.length - 1; i++) {
                    if (intVet[i] > intVet[i + 1]) {
                        comp++;
                        //realizar troca de elementos
                        int aux = intVet[i];
                        intVet[i] = intVet[i + 1];
                        intVet[i + 1] = aux;
                        mov++;
                        blnFlag = true;
                    }
                }
                
            }

            System.out.println("Comparações = " + comp);
            System.out.println("Movitação =" + mov);
                long tempoFinal = System.currentTimeMillis();
                System.out.printf("Tempo:%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

        } catch (Exception e) {
            System.out.println("ERRO NA CLASSE PRINCIPAL" + e.getMessage());
        } finally {
        }
    }
}
