import java.util.Scanner;

public class ExVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];
        int fatorial = 1; // declarada aqui em cima

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            fatorial = 1; 
            for (int j = 1; j <= A[i]; j++) {
                fatorial = fatorial * j;
            }
            B[i] = fatorial;
        }

        System.out.println("Fatoriais:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Fatorial de " + A[i] + " = " + B[i]);
        }

        ler.close();
    }
}
