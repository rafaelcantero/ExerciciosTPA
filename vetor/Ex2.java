import java.util.Scanner;
 
public class ExVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        int[] A = new int[5];
 
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            A[i] = ler.nextInt();
        }
 
        for (int i = 0; i < 5; i++) {
            System.out.println("Tabuada de " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + "x" + j + "=" + (A[i] * j));
            }
        }
 
        ler.close();
    }
}
