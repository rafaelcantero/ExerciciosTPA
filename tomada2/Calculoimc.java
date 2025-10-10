import java.util.Scanner;
public class Calculoimc {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso,altura,imc;
		
		System.out.println("Digite o seu peso:");
		peso= ler.nextDouble();		
		
		System.out.println("Digite sua altura:");
		altura= ler.nextDouble();
		
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é:" + imc);
		
		if(imc< 18.5 ){
			System.out.println("excesso de magreza ");
			
		}
		else if (imc> 18.5  && imc<=25){
			System.out.println("peso normal");
			
		}
		else if(imc > 25 && imc<=30) {
			System.out.println("excesso de peso");
		}
		else if (imc>30  && imc<=35) {
			System.out.println("obesidade(Grau 1)");
		}else if (imc>35 && imc<= 40) {
			System.out.println("obesidade(Grau 2)");
		}
		else if (imc>40) {
			System.out.println("obesidade(Grau 3)");
		}
			
			
		
	}

}
