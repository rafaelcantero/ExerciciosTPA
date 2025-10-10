import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double A,B,C;
		
		System.out.println("Digite o primeiro lado:");
		A= ler.nextDouble();
		
		System.out.println("digite o segundo lado:");
		B= ler.nextDouble();
		
		System.out.println("digite o terceiro vlado:");
		C= ler.nextDouble();
		
		if (A > B + C  || B>A+C){
			System.out.println("Não é um triângulo");
		}
		else if (A==B && B==C ) {
			System.out.println("é um triângulo equilatero");
			
		}
		else if (A!=B && B!=C && A!=C) {
			System.out.println("É um triângulo escaleno");
			
		}else  {
			System.out.println("é um triãngulo isóceles");
		}
		
	}

}
