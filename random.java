import java.util.Scanner;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        int[] values = new int[10];

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean rispostaq = true;

        do {

            System.out.println("1: caricamento tastiera");
            System.out.println("2: caricamento random");
            System.out.println("3: visualizzazione");
            System.out.println("4: inserimento in posizione");
            System.out.println("5: cancellazione di un elemento cercato");
            System.out.println("6: Esci");


            int risposta = in.nextInt();

            switch (risposta) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Inserisci il " + (i + 1) + " elemento dell'Array");
                        values[i] = in.nextInt();
                    }
                    break;

                case 2: System.out.println("Questo è l'array con elementi random:");
                    for (int i = 0; i < 10; i++) {
                        values[i] = random.nextInt(10) + 1;
                        System.out.print(values[i] + " ");
                    }
                    break;

                case 3:

                    for (int i = 0; i < 10; i++) {
                        System.out.print(values[i] + " ");
                    }

                    break;

                case 4:

                    System.out.println("Dove vorresti aggiungere un elemento dell'Array? ");
                    int posizione = in.nextInt();
                    System.out.println("Inserisci l'elemento che vorresti aggiungere");
                    values[posizione] = in.nextInt();


                    break;

                case 5:
                    for (int i = 0; i < 10; i++) {

                    System.out.print(values[i] + " ");
                }
                    System.out.println(" ");
                    System.out.println("Quale elemento dell'Array vorresti cancellare? ");
                    int elemento = in.nextInt();

                    System.out.println("Inserisci l'elemento che vorresti cancellare");
                    values[elemento] = 0;

                    for (int i = 0; i < 10; i++) {
                        System.out.print(values[i] + " ");
                    }

                    break;

                case 6:
                    rispostaq = false;
                    break;

            }
        }while (rispostaq) ;


    }
}