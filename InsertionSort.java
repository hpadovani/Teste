import java.util.Random;

public class InsertionSort {

    static int mov = 0;
    static int comp = 0;
    static int[] intVet = new int[100];

    public static void main(String[] args) {
        Random objRandom = new Random();
        for (int i = 0; i < intVet.length; i++) {
            intVet[i] = objRandom.nextInt(1200);
        }
        try {

            //percorre os elementos do vetor da esquerda para direita;
            long tempoInicial = System.currentTimeMillis();
            for (int i = 0; i < intVet.length; i++) {
                int num = intVet[i];
                int j = i - 1;
                //percorre os elementos do vetor da direta para esquerda;
                while (j >= 0) {
                    //verifica se o elemento do vetor é maior que o elemento marcado
                    // caso seja realiza a troca do elemento
                    if (intVet[j] > num) {
                        comp++;
                        intVet[j + 1] = intVet[j];
                        intVet[j] = num;
                        mov++;
                    }
                    //decrementa o valor até que o elemento esteja ordenado
                    j--;
                }
            }

            System.out.println("Comparações = " + comp);
            System.out.println("Movitação =" + mov);
            long tempoFinal = System.currentTimeMillis();
            System.out.printf("Tempo:%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
        } catch (Exception c) {
            System.out.println("" + c.getMessage());
        } finally {
        }
    }
}
