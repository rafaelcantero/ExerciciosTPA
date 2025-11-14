package vetores;
 
import java.util.Scanner;
 
public class ExVetores {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int i, a[], b[], c[];
 
        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];
 
        // ler o vetor A
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "valor do vetor A:");
            a[i] = in.nextInt();
        }
 
        // ler o vetor B
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor B:");
            b[i] = in.nextInt();
        }
 
        //  vetor C
        for (i = 0; i < TAM; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }
 
        for (i = 0; i < TAM; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}
