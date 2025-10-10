import java.util.Scanner;
public class Calculaidade {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Double anoNasc,anoAtual,idade;
        System.out.println("Digite o ano em que vc nasceu:");
        anoNasc = in.nextDouble();
        System.out.println("Digite o ano Atual:");
        anoAtual = in.nextDouble();
        idade = (anoAtual-anoNasc);
        System.out.println("A sua idade é:"+idade);
        if (idade<10) {
            System.out.println("Criança");
        }
        else if (idade>=10 && idade<18) {
            System.out.println("Adolecente");
        }
        else if(idade>=18 && idade<=60) {
             System.out.println("Adulto");
        }
       else if (idade > 60) {
           System.out.println("Idoso");
       }
    }

}
