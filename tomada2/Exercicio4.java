import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double A,B,C,raiz,delta,x1,x2 ;
		
		System.out.println("digite o valor de a:");
		A= ler.nextDouble();
		
		System.out.println("digite o valor de b:");
		B= ler.nextDouble();
		
		System.out.println("digite o valor de C:");
		C= ler.nextDouble();
				
		delta= B*B-4*A*C;
		 
		if(delta<0) {
			System.out.println("Não existe raiz");
		}
		else if(delta==0) {
			x1=(-B)/(2*A);
			System.out.println("sua raiz 1 é:" + x1);
		}
		else if (delta>0) {
			x1=(-B)+ Math.sqrt(delta)/(2*A);
			x2=(-B)- Math.sqrt(delta)/(2*A);
			System.err.println("As raizes x1 e x2 são:"+x1 +x2);
		}
	}

}
